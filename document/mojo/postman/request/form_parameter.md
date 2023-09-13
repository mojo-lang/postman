| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `key` | `string` |  | Y |  |
| `value` | `string` |  | N |  | enabled if type is "text" |
| `src` | `string` |  | N |  | enabled if type is "file" |
| `disabled` | `boolean` |  | N |  | When set to true, prevents this form data entity from being sent. |
| `type` | `string` |  | N |  | should be "text", or "file" |
| `contentType` | `string` |  | N |  | Override Content-Type header of this form data entity. |
| `description` | `mojo.postman.Description` |  | N |  | A Description can be a raw text, or be an object, which holds the description along with its format. |
