| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `id` | `string` |  | N |  | A variable ID is a unique user-defined value that identifies the variable within a collection.In traditional terms, this would be a variable name. |
| `key` | `string` |  | N |  | A variable key is a human friendly value that identifies the variable within a collection.In traditional terms, this would be a variable name. |
| `value` | `mojo.core.Value` |  | N |  | The value that a variable holds in this collection.Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection |
| `type` | `string` |  | N |  | A variable may have multiple types. This field specifies the type of the variable.One of "string","boolean","any","number" |
| `name` | `string` |  | N |  | Variable name |
| `description` | `mojo.postman.Description` |  | N |  | A Description can be a raw text, or be an object, which holds the description along with its format. |
| `system` | `boolean` |  | N |  | When set to true, indicates that this variable has been set by Postman |
| `disabled` | `boolean` |  | N |  |
