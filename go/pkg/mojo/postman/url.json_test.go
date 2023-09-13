package postman

import (
	"testing"

	jsoniter "github.com/json-iterator/go"
	"github.com/stretchr/testify/assert"
)

func TestUrlPathSegmentCodec_Encode(t *testing.T) {
	path := []*Url_PathSegment{{Value: "foo"}, {Value: "bar"}}
	str, err := jsoniter.ConfigDefault.MarshalToString(path)
	assert.NoError(t, err)
	assert.NotEmpty(t, str)

	path = []*Url_PathSegment{{Type: "param", Value: "foo"}, {Value: "bar"}}
	str, err = jsoniter.ConfigDefault.MarshalToString(path)
	assert.NoError(t, err)
	assert.NotEmpty(t, str)
}

func TestUrlPathSegmentCodec_Decode(t *testing.T) {
	str := `["foo", "bar"]`

	var path []*Url_PathSegment
	err := jsoniter.Unmarshal([]byte(str), &path)
	assert.NoError(t, err)
	assert.Equal(t, 2, len(path))

	str = `[{"type":"param","value":"foo"},"bar",{"value":"baz"}]`
	path = []*Url_PathSegment{}
	err = jsoniter.Unmarshal([]byte(str), &path)
	assert.NoError(t, err)
	assert.Equal(t, 3, len(path))
}
