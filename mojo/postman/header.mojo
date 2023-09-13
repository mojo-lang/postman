
/// Represents a single HTTP Header
type Header {
    /// This holds the LHS of the HTTP Header, e.g ``Content-Type`` or ``X-Custom-Header``
    key: String @1 @required

    /// The value (or the RHS) of the Header is stored in this field.
    value: String @2 @required

    /// If set to true, the current header will not be sent with requests.
    disabled: Bool @3

    description: Description @4
}