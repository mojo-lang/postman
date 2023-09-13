| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `info` | `mojo.postman.Info` |  | Y |  | InformationDetailed description of the info block |
| `item` | `Array<mojo.postman.Item>` |  | Y |  | Items are the basic unit for a Postman collection.You can think of them as corresponding to a single API endpoint.Each Item has one request and may have multiple API responses associated with it. |
| `variable` | `Array<mojo.postman.Variable>` |  | N |  | Collection variables allow you to define a set of variables, that are a **,as opposed to environments, which are separate entities.<br>** |
