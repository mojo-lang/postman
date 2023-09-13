
/// If object, contains the complete broken-down URL for this request. If string, contains the literal request URL.
type Url {
    /// The complete path of the current url, broken down into segments. A segment could be a string, or a path variable.
    type PathSegment {
        type: String @1
        value: String @2
    }

    type QueryParam {
        key: String @1

        value: String @2

        /// If set to true, the current query parameter will not be sent with the request.
        disabled: Bool @3

        description: Description @4
    }

    /// The string representation of the request URL, including the protocol, host, path, hash, query parameter(s) and path variable(s).
    raw: String @1

    /// The protocol associated with the request, E.g: 'http'
    protocol: String @2

    /// The host for the URL, E.g: api.yourdomain.com. Can be stored as a string or as an array of strings.
    host: [String] @3

    path: [PathSegment] @4

    /// The port number present in this URL. An empty value implies 80/443 depending on whether the protocol field contains http/https.
    port: String @5

    /// An array of QueryParams, which is basically the query string part of the URL, parsed into separate variables
    query: [QueryParam] @6

    /// Contains the URL fragment (if any).
    /// Usually this is not transmitted over the network, but it could be useful to store this in some cases.
    hash: String @7

    /// Postman supports path variables with the syntax `/path/:variableName/to/somewhere`.
    /// These variables are stored in this field.
    variable: [Variable] @8
}