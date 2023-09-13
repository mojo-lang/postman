| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `id` | `string` |  | N |  | A unique, user defined identifier that can  be used to refer to this response from requests. |
| `originalRequest` | `mojo.postman.Request` |  | N |  | A request represents an HTTP request.If a string, the string is assumed to be the request URL and the method is assumed to be 'GET'. |
| `responseTime` | `integer` | `Int32` | N |  | The time taken by the request to complete. If a number, the unit is milliseconds.If the response is manually created, this can be set to `null`. |
| `timings` | `mojo.core.Object` |  | N |  | Set of timing information related to request and response in milliseconds |
| `header` | `Array<mojo.postman.Header>` |  | N |  | No HTTP request is complete without its headers, and the same is true for a Postman request.This field is an array containing all the headers. |
| `body` | `string` |  | N |  | The raw text of the response. |
| `status` | `string` |  | N |  | The response status, e.g: '200 OK' |
| `code` | `integer` | `Int32` | N |  | The numerical response code, example: 200, 201, 404, etc. |
