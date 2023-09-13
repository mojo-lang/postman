
/// Using variables in your Postman requests eliminates the need to duplicate requests, which can save a lot of time.
/// Variables can be defined, and referenced to from any part of a request.
type Variable {
    /// A variable ID is a unique user-defined value that identifies the variable within a collection.
    /// In traditional terms, this would be a variable name.
    id: String @1

    /// A variable key is a human friendly value that identifies the variable within a collection.
    /// In traditional terms, this would be a variable name.
    key: String @2

    /// The value that a variable holds in this collection.
    /// Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
    value: Value @3

    /// A variable may have multiple types. This field specifies the type of the variable.
    /// One of "string","boolean","any","number"
    type: String @4

    /// Variable name
    name: String @5

    description: Description @6

    /// When set to true, indicates that this variable has been set by Postman
    system: Bool @7

    disabled: Bool @8
}