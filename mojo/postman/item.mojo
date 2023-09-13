
/// Items are entities which contain an actual HTTP request, and sample responses attached to it.
type Item {
    /// A unique ID that is used to identify collections internally
    /// only leaf type
    id: String @1

    /// A human readable identifier for the current item.
    name: String @2

    description: Description @3

    /// Collection variables allow you to define a set of variables, that are a *part of the collection*,
    /// as opposed to environments, which are separate entities.
    ///
    /// *Note: Collection variables must not contain any sensitive information.*
    variable: [Variable] @4

    /// Items are entities which contain an actual HTTP request, and sample responses attached to it.
    /// Folders may contain many items.
    item: [ Item ] @10

    request: Request @11 @required

    response: [Response] @12

    //event: EventList @7
    //protocol_profile_behavior: protocolProfileBehavior @8
}