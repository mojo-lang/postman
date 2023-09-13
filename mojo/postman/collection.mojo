
type Collection {
    info: Info @1 @required

    /// Items are the basic unit for a Postman collection.
    /// You can think of them as corresponding to a single API endpoint.
    /// Each Item has one request and may have multiple API responses associated with it.
    item: [ Item ] @2 @required

    /// Collection variables allow you to define a set of variables, that are a *part of the collection*,
    /// as opposed to environments, which are separate entities.
    ///
    /// *Note: Collection variables must not contain any sensitive information.*
    variable: [Variable] @5
}
