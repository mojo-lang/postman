| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `id` | `string` |  | N |  | A unique ID that is used to identify collections internallyonly leaf type |
| `name` | `string` |  | N |  | A human readable identifier for the current item. |
| `description` | `mojo.postman.Description` |  | N |  | A Description can be a raw text, or be an object, which holds the description along with its format. |
| `variable` | `Array<mojo.postman.Variable>` |  | N |  | Collection variables allow you to define a set of variables, that are a **,as opposed to environments, which are separate entities.<br>** |
| `item` | `Array<mojo.postman.Item>` |  | N |  | Items are entities which contain an actual HTTP request, and sample responses attached to it.Folders may contain many items. |
| `request` | `mojo.postman.Request` |  | Y |  | A request represents an HTTP request.If a string, the string is assumed to be the request URL and the method is assumed to be 'GET'. |
| `response` | `Array<mojo.postman.Response>` |  | N |  |
