| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `url` | `mojo.postman.Url` |  | N |  | If object, contains the complete broken-down URL for this request. If string, contains the literal request URL. |
| `method` | `string` |  | N |  | The Standard HTTP method associated with this request.One of  "GET","PUT","POST","PATCH","DELETE","COPY","HEAD","OPTIONS","LINK","UNLINK","PURGE","LOCK","UNLOCK","PROPFIND","VIEW"Or the Custom HTTP method associated with this request. |
| `description` | `mojo.postman.Description` |  | N |  | A Description can be a raw text, or be an object, which holds the description along with its format. |
| `header` | `Array<mojo.postman.Header>` |  | N |  |
| `body` | `mojo.postman.Request.Body` |  | N |  | This field contains the data usually contained in the request body. |
