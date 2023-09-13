// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/postman/response.proto

package postman

import (
	core "github.com/mojo-lang/core/go/pkg/mojo/core"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type Response struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id              string       `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	OriginalRequest *Request     `protobuf:"bytes,2,opt,name=original_request,json=originalRequest,proto3" json:"originalRequest,omitempty"`
	ResponseTime    int32        `protobuf:"varint,3,opt,name=response_time,json=responseTime,proto3" json:"responseTime,omitempty"`
	Timings         *core.Object `protobuf:"bytes,4,opt,name=timings,proto3" json:"timings,omitempty"`
	Header          []*Header    `protobuf:"bytes,5,rep,name=header,proto3" json:"header,omitempty"`
	Body            string       `protobuf:"bytes,10,opt,name=body,proto3" json:"body,omitempty"`
	Status          string       `protobuf:"bytes,11,opt,name=status,proto3" json:"status,omitempty"`
	Code            int32        `protobuf:"varint,12,opt,name=code,proto3" json:"code,omitempty"`
}

func (x *Response) Reset() {
	*x = Response{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_postman_response_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Response) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Response) ProtoMessage() {}

func (x *Response) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_postman_response_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Response.ProtoReflect.Descriptor instead.
func (*Response) Descriptor() ([]byte, []int) {
	return file_mojo_postman_response_proto_rawDescGZIP(), []int{0}
}

func (x *Response) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Response) GetOriginalRequest() *Request {
	if x != nil {
		return x.OriginalRequest
	}
	return nil
}

func (x *Response) GetResponseTime() int32 {
	if x != nil {
		return x.ResponseTime
	}
	return 0
}

func (x *Response) GetTimings() *core.Object {
	if x != nil {
		return x.Timings
	}
	return nil
}

func (x *Response) GetHeader() []*Header {
	if x != nil {
		return x.Header
	}
	return nil
}

func (x *Response) GetBody() string {
	if x != nil {
		return x.Body
	}
	return ""
}

func (x *Response) GetStatus() string {
	if x != nil {
		return x.Status
	}
	return ""
}

func (x *Response) GetCode() int32 {
	if x != nil {
		return x.Code
	}
	return 0
}

var File_mojo_postman_response_proto protoreflect.FileDescriptor

var file_mojo_postman_response_proto_rawDesc = []byte{
	0x0a, 0x1b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x1a, 0x15, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2f, 0x63, 0x6f, 0x72, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x19, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e,
	0x2f, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1a, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9c, 0x02, 0x0a, 0x08, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x40, 0x0a, 0x10, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e,
	0x61, 0x6c, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2e,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x52, 0x0f, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e, 0x61,
	0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x0c, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x2b, 0x0a,
	0x07, 0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11,
	0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63,
	0x74, 0x52, 0x07, 0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x73, 0x12, 0x2c, 0x0a, 0x06, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2e, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x12, 0x0a, 0x04, 0x62, 0x6f, 0x64, 0x79,
	0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x62, 0x6f, 0x64, 0x79, 0x12, 0x16, 0x0a, 0x06,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x0c, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x42, 0x66, 0x0a, 0x19, 0x6f, 0x72, 0x67, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f,
	0x73, 0x74, 0x6d, 0x61, 0x6e, 0x42, 0x0d, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x70, 0x6f, 0x73,
	0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x3b, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_postman_response_proto_rawDescOnce sync.Once
	file_mojo_postman_response_proto_rawDescData = file_mojo_postman_response_proto_rawDesc
)

func file_mojo_postman_response_proto_rawDescGZIP() []byte {
	file_mojo_postman_response_proto_rawDescOnce.Do(func() {
		file_mojo_postman_response_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_postman_response_proto_rawDescData)
	})
	return file_mojo_postman_response_proto_rawDescData
}

var file_mojo_postman_response_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_postman_response_proto_goTypes = []interface{}{
	(*Response)(nil),    // 0: mojo.postman.Response
	(*Request)(nil),     // 1: mojo.postman.Request
	(*core.Object)(nil), // 2: mojo.core.Object
	(*Header)(nil),      // 3: mojo.postman.Header
}
var file_mojo_postman_response_proto_depIdxs = []int32{
	1, // 0: mojo.postman.Response.original_request:type_name -> mojo.postman.Request
	2, // 1: mojo.postman.Response.timings:type_name -> mojo.core.Object
	3, // 2: mojo.postman.Response.header:type_name -> mojo.postman.Header
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_mojo_postman_response_proto_init() }
func file_mojo_postman_response_proto_init() {
	if File_mojo_postman_response_proto != nil {
		return
	}
	file_mojo_postman_header_proto_init()
	file_mojo_postman_request_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_postman_response_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Response); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_postman_response_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_postman_response_proto_goTypes,
		DependencyIndexes: file_mojo_postman_response_proto_depIdxs,
		MessageInfos:      file_mojo_postman_response_proto_msgTypes,
	}.Build()
	File_mojo_postman_response_proto = out.File
	file_mojo_postman_response_proto_rawDesc = nil
	file_mojo_postman_response_proto_goTypes = nil
	file_mojo_postman_response_proto_depIdxs = nil
}
