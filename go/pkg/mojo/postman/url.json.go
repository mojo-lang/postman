package postman

import (
	"fmt"
	"unsafe"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func init() {
	core.RegisterJSONTypeDecoder("postman.Url_PathSegment", &UrlPathSegmentCodec{})
	core.RegisterJSONTypeEncoder("postman.Url_PathSegment", &UrlPathSegmentCodec{})
}

type UrlPathSegmentCodec struct {
}

func (codec *UrlPathSegmentCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	val := iter.ReadAny()
	if val.ValueType() == jsoniter.StringValue {
		(*Url_PathSegment)(ptr).Value = val.ToString()
	} else if val.ValueType() == jsoniter.ObjectValue {
		segment := (*Url_PathSegment)(ptr)
		segment.Type = val.Get("type").ToString()
		segment.Value = val.Get("value").ToString()
	} else {
		iter.ReportError("Description", fmt.Sprintf("invalid Description type value, original type: %d", val.ValueType()))
	}
}

func (codec *UrlPathSegmentCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*Description)(ptr)
	return e == nil
}

func (codec *UrlPathSegmentCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	segment := (*Url_PathSegment)(ptr)
	if len(segment.Type) > 0 {
		stream.WriteObjectStart()
		stream.WriteObjectField("type")
		stream.WriteString(segment.Type)
		stream.WriteObjectField("value")
		stream.WriteString(segment.Value)
		stream.WriteObjectEnd()
	} else {
		stream.WriteString(segment.Value)
	}
}
