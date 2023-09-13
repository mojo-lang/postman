
/// A request represents an HTTP request.
/// If a string, the string is assumed to be the request URL and the method is assumed to be 'GET'.
type Request {
    /// This field contains the data usually contained in the request body.
    type Body {
        /// Postman stores the type of data associated with this request in this field.
        /// Should be one of the "raw","urlencoded","formdata","file","graphql"
        mode: String @1

        raw: String @2

        urlencoded: [UrlEncodedParameter] @3

        formdata: [FormParameter] @4

        file: File @5

        graphql: Object @6

        /// Additional configurations and options set for various body modes.
        options: Object @7

        /// When set to true, prevents request body from being sent.
        disabled: Bool @8
    }

    type UrlEncodedParameter {
        key: String @1 @required
        value: String @2
        disabled: Bool @3
        description: Description @4
    }

    type FormParameter {
        key: String @1 @required

        /// enabled if type is "text"
        value: String @2

        /// enabled if type is "file"
        src: String @3

        /// When set to true, prevents this form data entity from being sent.
        disabled: Bool @4

        /// should be "text", or "file"
        type: String @5

        /// Override Content-Type header of this form data entity.
        content_type: String @6

        description: Description @7
    }

    type File {
        /// Contains the name of the file to upload. _Not the path_.
        /// A null src indicates that no file has been selected as a part of the request body
        src: String @1

        content: String @2
    }

    url: Url @1
    //auth: Auth @2

    /// The Standard HTTP method associated with this request.
    /// One of  "GET","PUT","POST","PATCH","DELETE","COPY","HEAD","OPTIONS","LINK","UNLINK","PURGE","LOCK","UNLOCK","PROPFIND","VIEW"
    /// Or the Custom HTTP method associated with this request.
    method: String @3

    description: Description @4

    header: [Header] @5

    body: Body @8
}