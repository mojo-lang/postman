| field | type | format | required | default | description |
|---|---|---|---|---|---|
| `name` | `string` |  | Y |  | Name of the collection<br>A collection's friendly name is defined by this field.You would want to set this field to a value that would allow you to easily identify this collectionamong a bunch of other collections, as such outlining its usage or content. |
| `PostmanId` | `string` |  | N |  | Every collection is identified by the unique value of this field.The value of this field is usually easiest to generate using a UID generator function.If you already have a collection, it is recommended that you maintain the same id sincechanging the id usually implies that is a different collection than it was originally.<br>** |
| `description` | `mojo.postman.Description` |  | N |  | A Description can be a raw text, or be an object, which holds the description along with its format. |
| `version` | `string` | `Version` | N |  | Semantic Versioning<br>(spec)[http://semver.org/spec/v2.0.0.html] |
| `schema` | `string` |  | Y |  | This should ideally hold a link to the Postman schema that is used to validate this collection.E.g:  |
