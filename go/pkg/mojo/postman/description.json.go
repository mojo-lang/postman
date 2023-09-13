package postman

import (
	"fmt"
	"unsafe"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func init() {
	core.RegisterJSONTypeDecoder("postman.Description", &DescriptionCodec{})
}

type DescriptionCodec struct {
}

func (codec *DescriptionCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	val := iter.ReadAny()
	if val.ValueType() == jsoniter.StringValue {
		(*Description)(ptr).Content = val.ToString()
	} else if val.ValueType() == jsoniter.ObjectValue {
		d := (*Description)(ptr)
		d.Type = val.Get("type").ToString()
		d.Content = val.Get("content").ToString()
		d.Version = val.Get("version").ToString()
	} else {
		iter.ReportError("Description", fmt.Sprintf("invalid Description type value, original type: %d", val.ValueType()))
	}
}

func (codec *DescriptionCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*Description)(ptr)
	return e == nil
}
