package postman

import (
	_ "embed"
	"testing"

	jsoniter "github.com/json-iterator/go"
	"github.com/stretchr/testify/assert"
)

//go:embed testdata/postman2.base.json
var postman2Base []byte

func TestPostmanUnmarshal(t *testing.T) {
	col := &Collection{}
	err := jsoniter.ConfigFastest.Unmarshal(postman2Base, col)
	assert.NoError(t, err)
}
