| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `raw` | `string` |  | N |  | The string representation of the request URL, including the protocol, host, path, hash, query parameter(s) and path variable(s). |
| `protocol` | `string` |  | N |  | The protocol associated with the request, E.g: 'http' |
| `host` | `Array<string>` |  | N |  | The host for the URL, E.g: api.yourdomain.com. Can be stored as a string or as an array of strings. |
| `path` | `Array<mojo.postman.Url.PathSegment>` |  | N |  |
| `port` | `string` |  | N |  | The port number present in this URL. An empty value implies 80/443 depending on whether the protocol field contains http/https. |
| `query` | `Array<mojo.postman.Url.QueryParam>` |  | N |  | An array of QueryParams, which is basically the query string part of the URL, parsed into separate variables |
| `hash` | `string` |  | N |  | Contains the URL fragment (if any).Usually this is not transmitted over the network, but it could be useful to store this in some cases. |
| `variable` | `Array<mojo.postman.Variable>` |  | N |  | Postman supports path variables with the syntax `/path/:variableName/to/somewhere`.These variables are stored in this field. |
