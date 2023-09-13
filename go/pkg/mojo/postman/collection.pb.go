// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/postman/collection.proto

package postman

import (
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

type Collection struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info     *Info       `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	Item     []*Item     `protobuf:"bytes,2,rep,name=item,proto3" json:"item,omitempty"`
	Variable []*Variable `protobuf:"bytes,5,rep,name=variable,proto3" json:"variable,omitempty"`
}

func (x *Collection) Reset() {
	*x = Collection{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_postman_collection_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Collection) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Collection) ProtoMessage() {}

func (x *Collection) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_postman_collection_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Collection.ProtoReflect.Descriptor instead.
func (*Collection) Descriptor() ([]byte, []int) {
	return file_mojo_postman_collection_proto_rawDescGZIP(), []int{0}
}

func (x *Collection) GetInfo() *Info {
	if x != nil {
		return x.Info
	}
	return nil
}

func (x *Collection) GetItem() []*Item {
	if x != nil {
		return x.Item
	}
	return nil
}

func (x *Collection) GetVariable() []*Variable {
	if x != nil {
		return x.Variable
	}
	return nil
}

var File_mojo_postman_collection_proto protoreflect.FileDescriptor

var file_mojo_postman_collection_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x63,
	0x6f, 0x6c, 0x6c, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x1a, 0x17, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x69, 0x6e, 0x66, 0x6f,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73,
	0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x69, 0x74, 0x65, 0x6d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x76, 0x61,
	0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x90, 0x01, 0x0a,
	0x0a, 0x43, 0x6f, 0x6c, 0x6c, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x26, 0x0a, 0x04, 0x69,
	0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x04, 0x69,
	0x6e, 0x66, 0x6f, 0x12, 0x26, 0x0a, 0x04, 0x69, 0x74, 0x65, 0x6d, 0x18, 0x02, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e,
	0x2e, 0x49, 0x74, 0x65, 0x6d, 0x52, 0x04, 0x69, 0x74, 0x65, 0x6d, 0x12, 0x32, 0x0a, 0x08, 0x76,
	0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x16, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2e, 0x56, 0x61, 0x72,
	0x69, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x08, 0x76, 0x61, 0x72, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x42,
	0x68, 0x0a, 0x19, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x42, 0x0f, 0x43, 0x6f,
	0x6c, 0x6c, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x38, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x2f, 0x67, 0x6f,
	0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61,
	0x6e, 0x3b, 0x70, 0x6f, 0x73, 0x74, 0x6d, 0x61, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_mojo_postman_collection_proto_rawDescOnce sync.Once
	file_mojo_postman_collection_proto_rawDescData = file_mojo_postman_collection_proto_rawDesc
)

func file_mojo_postman_collection_proto_rawDescGZIP() []byte {
	file_mojo_postman_collection_proto_rawDescOnce.Do(func() {
		file_mojo_postman_collection_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_postman_collection_proto_rawDescData)
	})
	return file_mojo_postman_collection_proto_rawDescData
}

var file_mojo_postman_collection_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_postman_collection_proto_goTypes = []interface{}{
	(*Collection)(nil), // 0: mojo.postman.Collection
	(*Info)(nil),       // 1: mojo.postman.Info
	(*Item)(nil),       // 2: mojo.postman.Item
	(*Variable)(nil),   // 3: mojo.postman.Variable
}
var file_mojo_postman_collection_proto_depIdxs = []int32{
	1, // 0: mojo.postman.Collection.info:type_name -> mojo.postman.Info
	2, // 1: mojo.postman.Collection.item:type_name -> mojo.postman.Item
	3, // 2: mojo.postman.Collection.variable:type_name -> mojo.postman.Variable
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_mojo_postman_collection_proto_init() }
func file_mojo_postman_collection_proto_init() {
	if File_mojo_postman_collection_proto != nil {
		return
	}
	file_mojo_postman_info_proto_init()
	file_mojo_postman_item_proto_init()
	file_mojo_postman_variable_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_postman_collection_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Collection); i {
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
			RawDescriptor: file_mojo_postman_collection_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_postman_collection_proto_goTypes,
		DependencyIndexes: file_mojo_postman_collection_proto_depIdxs,
		MessageInfos:      file_mojo_postman_collection_proto_msgTypes,
	}.Build()
	File_mojo_postman_collection_proto = out.File
	file_mojo_postman_collection_proto_rawDesc = nil
	file_mojo_postman_collection_proto_goTypes = nil
	file_mojo_postman_collection_proto_depIdxs = nil
}