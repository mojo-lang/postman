| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `mode` | `string` |  | N |  | Postman stores the type of data associated with this request in this field.Should be one of the "raw","urlencoded","formdata","file","graphql" |
| `raw` | `string` |  | N |  |
| `urlencoded` | `Array<mojo.postman.Request.UrlEncodedParameter>` |  | N |  |
| `formdata` | `Array<mojo.postman.Request.FormParameter>` |  | N |  |
| `file` | `mojo.postman.Request.File` |  | N |  |  |
| `graphql` | `mojo.core.Object` |  | N |  | Object type |
| `options` | `mojo.core.Object` |  | N |  | Additional configurations and options set for various body modes. |
| `disabled` | `boolean` |  | N |  | When set to true, prevents request body from being sent. |
