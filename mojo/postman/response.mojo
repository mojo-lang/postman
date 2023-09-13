
/// A response represents an HTTP response.
type Response {
    /// A unique, user defined identifier that can  be used to refer to this response from requests.
    id: String @1

    original_request: Request @2

    /// The time taken by the request to complete. If a number, the unit is milliseconds.
    /// If the response is manually created, this can be set to `null`.
    response_time: Int32 @3

    /// Set of timing information related to request and response in milliseconds
    timings: Object @4

    /// No HTTP request is complete without its headers, and the same is true for a Postman request.
    /// This field is an array containing all the headers.
    header: [Header] @5

    //cookie: [Cookie] @6

    /// The raw text of the response.
    body: String @10

    /// The response status, e.g: '200 OK'
    status: String @11

    /// The numerical response code, example: 200, 201, 404, etc.
    code: Int32 @12
}