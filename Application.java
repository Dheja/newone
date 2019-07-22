package com.cg.osce.bean;



	public class Application {
		  private String openapi;
		  Info InfoObject;
		  ExternalDocs ExternalDocsObject;
		  ArrayList<Object> servers = new ArrayList<Object>();
		  ArrayList<Object> tags = new ArrayList<Object>();
		  Paths PathsObject;
		  Components ComponentsObject;


				public class Components {
		  Schemas SchemasObject;
		  SecuritySchemes SecuritySchemesObject;


				}
		public class SecuritySchemes {
		  Petstore_auth Petstore_authObject;
		  Api_key Api_keyObject;


				}
				public class Schemas {
		  Order OrderObject;
		  Category CategoryObject;
		  User UserObject;
		  Tag TagObject;
		  Pet PetObject;
		  ApiResponse ApiResponseObject;


				}
		public class ApiResponse {
		  private String type;
		  Properties PropertiesObject;


				}
		public class Properties {
		  Code CodeObject;
		  Type TypeObject;
		  Message MessageObject;


				}
		public class Message {
		  private String type;


				}
		public class Type {
		  private String type;


				}
		public class Code {
		  private String type;
		  private String format;


				}
		public class Pet {
		  ArrayList<Object> required = new ArrayList<Object>();
		  private String type;
		  Properties PropertiesObject;
		  Xml XmlObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }
		}
		public class Xml {
		  private String name;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }
		}
		public class Properties {
		  Id IdObject;
		  Category CategoryObject;
		  Name NameObject;
		  PhotoUrls PhotoUrlsObject;
		  Tags TagsObject;
		  Status StatusObject;


		 // Getter Methods 

		  public Id getId() {
		    return IdObject;
		  }

		  public Category getCategory() {
		    return CategoryObject;
		  }

		  public Name getName() {
		    return NameObject;
		  }

		  public PhotoUrls getPhotoUrls() {
		    return PhotoUrlsObject;
		  }

		  public Tags getTags() {
		    return TagsObject;
		  }

		  public Status getStatus() {
		    return StatusObject;
		  }

		 // Setter Methods 

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setCategory( Category categoryObject ) {
		    this.CategoryObject = categoryObject;
		  }

		  public void setName( Name nameObject ) {
		    this.NameObject = nameObject;
		  }

		  public void setPhotoUrls( PhotoUrls photoUrlsObject ) {
		    this.PhotoUrlsObject = photoUrlsObject;
		  }

		  public void setTags( Tags tagsObject ) {
		    this.TagsObject = tagsObject;
		  }

		  public void setStatus( Status statusObject ) {
		    this.StatusObject = statusObject;
		  }
		}
		public class Status {
		  private String type;
		  private String description;
		  ArrayList<Object> enum = new ArrayList<Object>();


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getDescription() {
		    return description;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }
		}
		public class Tags {
		  private String type;
		  Xml XmlObject;
		  Items ItemsObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		  public Items getItems() {
		    return ItemsObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }

		  public void setItems( Items itemsObject ) {
		    this.ItemsObject = itemsObject;
		  }
		}
		public class Items {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Xml {
		  private String name;
		  private boolean wrapped;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		  public boolean getWrapped() {
		    return wrapped;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }

		  public void setWrapped( boolean wrapped ) {
		    this.wrapped = wrapped;
		  }
		}
		public class PhotoUrls {
		  private String type;
		  Xml XmlObject;
		  Items ItemsObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		  public Items getItems() {
		    return ItemsObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }

		  public void setItems( Items itemsObject ) {
		    this.ItemsObject = itemsObject;
		  }
		}
		public class Items {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Xml {
		  private String name;
		  private boolean wrapped;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		  public boolean getWrapped() {
		    return wrapped;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }

		  public void setWrapped( boolean wrapped ) {
		    this.wrapped = wrapped;
		  }
		}
		public class Name {
		  private String type;
		  private String example;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getExample() {
		    return example;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setExample( String example ) {
		    this.example = example;
		  }
		}
		public class Category {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Id {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Tag {
		  private String type;
		  Properties PropertiesObject;
		  Xml XmlObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }
		}
		public class Xml {
		  private String name;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }
		}
		public class Properties {
		  Id IdObject;
		  Name NameObject;


		 // Getter Methods 

		  public Id getId() {
		    return IdObject;
		  }

		  public Name getName() {
		    return NameObject;
		  }

		 // Setter Methods 

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setName( Name nameObject ) {
		    this.NameObject = nameObject;
		  }
		}
		public class Name {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Id {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class User {
		  private String type;
		  Properties PropertiesObject;
		  Xml XmlObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }
		}
		public class Xml {
		  private String name;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }
		}
		public class Properties {
		  Id IdObject;
		  Username UsernameObject;
		  FirstName FirstNameObject;
		  LastName LastNameObject;
		  Email EmailObject;
		  Password PasswordObject;
		  Phone PhoneObject;
		  UserStatus UserStatusObject;


		 // Getter Methods 

		  public Id getId() {
		    return IdObject;
		  }

		  public Username getUsername() {
		    return UsernameObject;
		  }

		  public FirstName getFirstName() {
		    return FirstNameObject;
		  }

		  public LastName getLastName() {
		    return LastNameObject;
		  }

		  public Email getEmail() {
		    return EmailObject;
		  }

		  public Password getPassword() {
		    return PasswordObject;
		  }

		  public Phone getPhone() {
		    return PhoneObject;
		  }

		  public UserStatus getUserStatus() {
		    return UserStatusObject;
		  }

		 // Setter Methods 

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setUsername( Username usernameObject ) {
		    this.UsernameObject = usernameObject;
		  }

		  public void setFirstName( FirstName firstNameObject ) {
		    this.FirstNameObject = firstNameObject;
		  }

		  public void setLastName( LastName lastNameObject ) {
		    this.LastNameObject = lastNameObject;
		  }

		  public void setEmail( Email emailObject ) {
		    this.EmailObject = emailObject;
		  }

		  public void setPassword( Password passwordObject ) {
		    this.PasswordObject = passwordObject;
		  }

		  public void setPhone( Phone phoneObject ) {
		    this.PhoneObject = phoneObject;
		  }

		  public void setUserStatus( UserStatus userStatusObject ) {
		    this.UserStatusObject = userStatusObject;
		  }
		}
		public class UserStatus {
		  private String type;
		  private String description;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Phone {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Password {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Email {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class LastName {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class FirstName {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Username {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Id {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Category {
		  private String type;
		  Properties PropertiesObject;
		  Xml XmlObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }
		}
		public class Xml {
		  private String name;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }
		}
		public class Properties {
		  Id IdObject;
		  Name NameObject;


		 // Getter Methods 

		  public Id getId() {
		    return IdObject;
		  }

		  public Name getName() {
		    return NameObject;
		  }

		 // Setter Methods 

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setName( Name nameObject ) {
		    this.NameObject = nameObject;
		  }
		}
		public class Name {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Id {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Order {
		  private String type;
		  Properties PropertiesObject;
		  Xml XmlObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		  public Xml getXml() {
		    return XmlObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }

		  public void setXml( Xml xmlObject ) {
		    this.XmlObject = xmlObject;
		  }
		}
		public class Xml {
		  private String name;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }
		}
		public class Properties {
		  Id IdObject;
		  PetId PetIdObject;
		  Quantity QuantityObject;
		  ShipDate ShipDateObject;
		  Status StatusObject;
		  Complete CompleteObject;


		 // Getter Methods 

		  public Id getId() {
		    return IdObject;
		  }

		  public PetId getPetId() {
		    return PetIdObject;
		  }

		  public Quantity getQuantity() {
		    return QuantityObject;
		  }

		  public ShipDate getShipDate() {
		    return ShipDateObject;
		  }

		  public Status getStatus() {
		    return StatusObject;
		  }

		  public Complete getComplete() {
		    return CompleteObject;
		  }

		 // Setter Methods 

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setPetId( PetId petIdObject ) {
		    this.PetIdObject = petIdObject;
		  }

		  public void setQuantity( Quantity quantityObject ) {
		    this.QuantityObject = quantityObject;
		  }

		  public void setShipDate( ShipDate shipDateObject ) {
		    this.ShipDateObject = shipDateObject;
		  }

		  public void setStatus( Status statusObject ) {
		    this.StatusObject = statusObject;
		  }

		  public void setComplete( Complete completeObject ) {
		    this.CompleteObject = completeObject;
		  }
		}
		public class Complete {
		  private String type;
		  private boolean default;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public boolean getDefault() {
		    return default;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDefault( boolean default ) {
		    this.default = default;
		  }
		}
		public class Status {
		  private String type;
		  private String description;
		  ArrayList<Object> enum = new ArrayList<Object>();


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getDescription() {
		    return description;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }
		}
		public class ShipDate {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Quantity {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class PetId {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Id {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class Paths {
		  /pet /petObject;
		  /pet/{petId} /pet/{petId}Object;
		  /pet/{petId}/uploadImage /pet/{petId}/uploadImageObject;
		  /store/inventory /store/inventoryObject;
		  /store/order /store/orderObject;
		  /user /userObject;
		  /user/login /user/loginObject;
		  /user/logout /user/logoutObject;
		  /user/{username} /user/{username}Object;


		 // Getter Methods 

		  public /pet get/pet() {
		    return /petObject;
		  }

		  public /pet/{petId} get/pet/{petId}() {
		    return /pet/{petId}Object;
		  }

		  public /pet/{petId}/uploadImage get/pet/{petId}/uploadImage() {
		    return /pet/{petId}/uploadImageObject;
		  }

		  public /store/inventory get/store/inventory() {
		    return /store/inventoryObject;
		  }

		  public /store/order get/store/order() {
		    return /store/orderObject;
		  }

		  public /user get/user() {
		    return /userObject;
		  }

		  public /user/login get/user/login() {
		    return /user/loginObject;
		  }

		  public /user/logout get/user/logout() {
		    return /user/logoutObject;
		  }

		  public /user/{username} get/user/{username}() {
		    return /user/{username}Object;
		  }

		 // Setter Methods 

		  public void set/pet( /pet /petObject ) {
		    this./petObject = /petObject;
		  }

		  public void set/pet/{petId}( /pet/{petId} /pet/{petId}Object ) {
		    this./pet/{petId}Object = /pet/{petId}Object;
		  }

		  public void set/pet/{petId}/uploadImage( /pet/{petId}/uploadImage /pet/{petId}/uploadImageObject ) {
		    this./pet/{petId}/uploadImageObject = /pet/{petId}/uploadImageObject;
		  }

		  public void set/store/inventory( /store/inventory /store/inventoryObject ) {
		    this./store/inventoryObject = /store/inventoryObject;
		  }

		  public void set/store/order( /store/order /store/orderObject ) {
		    this./store/orderObject = /store/orderObject;
		  }

		  public void set/user( /user /userObject ) {
		    this./userObject = /userObject;
		  }

		  public void set/user/login( /user/login /user/loginObject ) {
		    this./user/loginObject = /user/loginObject;
		  }

		  public void set/user/logout( /user/logout /user/logoutObject ) {
		    this./user/logoutObject = /user/logoutObject;
		  }

		  public void set/user/{username}( /user/{username} /user/{username}Object ) {
		    this./user/{username}Object = /user/{username}Object;
		  }
		}
		public class /user/{username} {
		  Get GetObject;
		  Put PutObject;
		  Delete DeleteObject;


		 // Getter Methods 

		  public Get getGet() {
		    return GetObject;
		  }

		  public Put getPut() {
		    return PutObject;
		  }

		  public Delete getDelete() {
		    return DeleteObject;
		  }

		 // Setter Methods 

		  public void setGet( Get getObject ) {
		    this.GetObject = getObject;
		  }

		  public void setPut( Put putObject ) {
		    this.PutObject = putObject;
		  }

		  public void setDelete( Delete deleteObject ) {
		    this.DeleteObject = deleteObject;
		  }
		}
		public class Delete {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class Put {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class RequestBody {
		  private String description;
		  Content ContentObject;
		  private boolean required;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		  public boolean getRequired() {
		    return required;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }

		  public void setRequired( boolean required ) {
		    this.required = required;
		  }
		}
		public class Content {
		  */* */*Object;


		 // Getter Methods 

		  public */* get*/*() {
		    return */*Object;
		  }

		 // Setter Methods 

		  public void set*/*( */* */*Object ) {
		    this.*/*Object = */*Object;
		  }
		}
		public class */* {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Get {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 200 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/xml Application/xmlObject;
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class /user/logout {
		  Get GetObject;


		 // Getter Methods 

		  public Get getGet() {
		    return GetObject;
		  }

		 // Setter Methods 

		  public void setGet( Get getObject ) {
		    this.GetObject = getObject;
		  }
		}
		public class Get {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  Default DefaultObject;


		 // Getter Methods 

		  public Default getDefault() {
		    return DefaultObject;
		  }

		 // Setter Methods 

		  public void setDefault( Default defaultObject ) {
		    this.DefaultObject = defaultObject;
		  }
		}
		public class Default {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class /user/login {
		  Get GetObject;


		 // Getter Methods 

		  public Get getGet() {
		    return GetObject;
		  }

		 // Setter Methods 

		  public void setGet( Get getObject ) {
		    this.GetObject = getObject;
		  }
		}
		public class Get {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;
		  400 400Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		  public 400 get400() {
		    return 400Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }
		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 200 {
		  private String description;
		  Headers HeadersObject;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Headers getHeaders() {
		    return HeadersObject;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setHeaders( Headers headersObject ) {
		    this.HeadersObject = headersObject;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/xml Application/xmlObject;
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String type;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }
		}
		public class Headers {
		  X-Rate-Limit X-Rate-LimitObject;
		  X-Expires-After X-Expires-AfterObject;


		 // Getter Methods 

		  public X-Rate-Limit getX-Rate-Limit() {
		    return X-Rate-LimitObject;
		  }

		  public X-Expires-After getX-Expires-After() {
		    return X-Expires-AfterObject;
		  }

		 // Setter Methods 

		  public void setX-Rate-Limit( X-Rate-Limit X-Rate-LimitObject ) {
		    this.X-Rate-LimitObject = X-Rate-LimitObject;
		  }

		  public void setX-Expires-After( X-Expires-After X-Expires-AfterObject ) {
		    this.X-Expires-AfterObject = X-Expires-AfterObject;
		  }
		}
		public class X-Expires-After {
		  private String description;
		  Schema SchemaObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class X-Rate-Limit {
		  private String description;
		  Schema SchemaObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class /user {
		  Post PostObject;


		 // Getter Methods 

		  public Post getPost() {
		    return PostObject;
		  }

		 // Setter Methods 

		  public void setPost( Post postObject ) {
		    this.PostObject = postObject;
		  }
		}
		public class Post {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  Default DefaultObject;


		 // Getter Methods 

		  public Default getDefault() {
		    return DefaultObject;
		  }

		 // Setter Methods 

		  public void setDefault( Default defaultObject ) {
		    this.DefaultObject = defaultObject;
		  }
		}
		public class Default {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class RequestBody {
		  private String description;
		  Content ContentObject;
		  private boolean required;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		  public boolean getRequired() {
		    return required;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }

		  public void setRequired( boolean required ) {
		    this.required = required;
		  }
		}
		public class Content {
		  */* */*Object;


		 // Getter Methods 

		  public */* get*/*() {
		    return */*Object;
		  }

		 // Setter Methods 

		  public void set*/*( */* */*Object ) {
		    this.*/*Object = */*Object;
		  }
		}
		public class */* {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class /store/order {
		  Post PostObject;
		  Delete DeleteObject;


		 // Getter Methods 

		  public Post getPost() {
		    return PostObject;
		  }

		  public Delete getDelete() {
		    return DeleteObject;
		  }

		 // Setter Methods 

		  public void setPost( Post postObject ) {
		    this.PostObject = postObject;
		  }

		  public void setDelete( Delete deleteObject ) {
		    this.DeleteObject = deleteObject;
		  }
		}
		public class Delete {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class Post {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;
		  400 400Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		  public 400 get400() {
		    return 400Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }
		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 200 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/xml Application/xmlObject;
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class RequestBody {
		  private String description;
		  Content ContentObject;
		  private boolean required;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		  public boolean getRequired() {
		    return required;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }

		  public void setRequired( boolean required ) {
		    this.required = required;
		  }
		}
		public class Content {
		  */* */*Object;


		 // Getter Methods 

		  public */* get*/*() {
		    return */*Object;
		  }

		 // Setter Methods 

		  public void set*/*( */* */*Object ) {
		    this.*/*Object = */*Object;
		  }
		}
		public class */* {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class /store/inventory {
		  Get GetObject;


		 // Getter Methods 

		  public Get getGet() {
		    return GetObject;
		  }

		 // Setter Methods 

		  public void setGet( Get getObject ) {
		    this.GetObject = getObject;
		  }
		}
		public class Get {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }
		}
		public class 200 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String type;
		  AdditionalProperties AdditionalPropertiesObject;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public AdditionalProperties getAdditionalProperties() {
		    return AdditionalPropertiesObject;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setAdditionalProperties( AdditionalProperties additionalPropertiesObject ) {
		    this.AdditionalPropertiesObject = additionalPropertiesObject;
		  }
		}
		public class AdditionalProperties {
		  private String type;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class /pet/{petId}/uploadImage {
		  Post PostObject;


		 // Getter Methods 

		  public Post getPost() {
		    return PostObject;
		  }

		 // Setter Methods 

		  public void setPost( Post postObject ) {
		    this.PostObject = postObject;
		  }
		}
		public class Post {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }
		}
		public class 200 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class RequestBody {
		  Content ContentObject;


		 // Getter Methods 

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Multipart/form-data Multipart/form-dataObject;


		 // Getter Methods 

		  public Multipart/form-data getMultipart/form-data() {
		    return Multipart/form-dataObject;
		  }

		 // Setter Methods 

		  public void setMultipart/form-data( Multipart/form-data multipart/form-dataObject ) {
		    this.Multipart/form-dataObject = multipart/form-dataObject;
		  }
		}
		public class Multipart/form-data {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  Properties PropertiesObject;


		 // Getter Methods 

		  public Properties getProperties() {
		    return PropertiesObject;
		  }

		 // Setter Methods 

		  public void setProperties( Properties propertiesObject ) {
		    this.PropertiesObject = propertiesObject;
		  }
		}
		public class Properties {
		  AdditionalMetadata AdditionalMetadataObject;
		  File FileObject;


		 // Getter Methods 

		  public AdditionalMetadata getAdditionalMetadata() {
		    return AdditionalMetadataObject;
		  }

		  public File getFile() {
		    return FileObject;
		  }

		 // Setter Methods 

		  public void setAdditionalMetadata( AdditionalMetadata additionalMetadataObject ) {
		    this.AdditionalMetadataObject = additionalMetadataObject;
		  }

		  public void setFile( File fileObject ) {
		    this.FileObject = fileObject;
		  }
		}
		public class File {
		  private String type;
		  private String description;
		  private String format;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getFormat() {
		    return format;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setFormat( String format ) {
		    this.format = format;
		  }
		}
		public class AdditionalMetadata {
		  private String type;
		  private String description;


		 // Getter Methods 

		  public String getType() {
		    return type;
		  }

		  public String getDescription() {
		    return description;
		  }

		 // Setter Methods 

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }
		}
		public class /pet/{petId} {
		  Get GetObject;
		  Delete DeleteObject;


		 // Getter Methods 

		  public Get getGet() {
		    return GetObject;
		  }

		  public Delete getDelete() {
		    return DeleteObject;
		  }

		 // Setter Methods 

		  public void setGet( Get getObject ) {
		    this.GetObject = getObject;
		  }

		  public void setDelete( Delete deleteObject ) {
		    this.DeleteObject = deleteObject;
		  }
		}
		public class Delete {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class Get {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String description;
		  private String operationId;
		  ArrayList<Object> parameters = new ArrayList<Object>();
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  200 200Object;
		  400 400Object;
		  404 404Object;


		 // Getter Methods 

		  public 200 get200() {
		    return 200Object;
		  }

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		 // Setter Methods 

		  public void set200( 200 200Object ) {
		    this.200Object = 200Object;
		  }

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }
		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 200 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {
		  Application/xml Application/xmlObject;
		  Application/json Application/jsonObject;


		 // Getter Methods 

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		 // Setter Methods 

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class /pet {
		  Put PutObject;
		  Post PostObject;


		 // Getter Methods 

		  public Put getPut() {
		    return PutObject;
		  }

		  public Post getPost() {
		    return PostObject;
		  }

		 // Setter Methods 

		  public void setPut( Put putObject ) {
		    this.PutObject = putObject;
		  }

		  public void setPost( Post postObject ) {
		    this.PostObject = postObject;
		  }
		}
		public class Post {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  405 405Object;


		 // Getter Methods 

		  public 405 get405() {
		    return 405Object;
		  }

		 // Setter Methods 

		  public void set405( 405 405Object ) {
		    this.405Object = 405Object;
		  }
		}
		public class 405 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class RequestBody {
		  private String description;
		  Content ContentObject;
		  private boolean required;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		  public boolean getRequired() {
		    return required;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }

		  public void setRequired( boolean required ) {
		    this.required = required;
		  }
		}
		public class Content {
		  Application/json Application/jsonObject;
		  Application/xml Application/xmlObject;


		 // Getter Methods 

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		 // Setter Methods 

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Put {
		  ArrayList<Object> tags = new ArrayList<Object>();
		  private String summary;
		  private String operationId;
		  RequestBody RequestBodyObject;
		  Responses ResponsesObject;
		  ArrayList<Object> security = new ArrayList<Object>();


		 // Getter Methods 

		  public String getSummary() {
		    return summary;
		  }

		  public String getOperationId() {
		    return operationId;
		  }

		  public RequestBody getRequestBody() {
		    return RequestBodyObject;
		  }

		  public Responses getResponses() {
		    return ResponsesObject;
		  }

		 // Setter Methods 

		  public void setSummary( String summary ) {
		    this.summary = summary;
		  }

		  public void setOperationId( String operationId ) {
		    this.operationId = operationId;
		  }

		  public void setRequestBody( RequestBody requestBodyObject ) {
		    this.RequestBodyObject = requestBodyObject;
		  }

		  public void setResponses( Responses responsesObject ) {
		    this.ResponsesObject = responsesObject;
		  }
		}
		public class Responses {
		  400 400Object;
		  404 404Object;
		  405 405Object;


		 // Getter Methods 

		  public 400 get400() {
		    return 400Object;
		  }

		  public 404 get404() {
		    return 404Object;
		  }

		  public 405 get405() {
		    return 405Object;
		  }

		 // Setter Methods 

		  public void set400( 400 400Object ) {
		    this.400Object = 400Object;
		  }

		  public void set404( 404 404Object ) {
		    this.404Object = 404Object;
		  }

		  public void set405( 405 405Object ) {
		    this.405Object = 405Object;
		  }
		}
		public class 405 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 404 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class 400 {
		  private String description;
		  Content ContentObject;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }
		}
		public class Content {


		 // Getter Methods 



		 // Setter Methods 


		}
		public class RequestBody {
		  private String description;
		  Content ContentObject;
		  private boolean required;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public Content getContent() {
		    return ContentObject;
		  }

		  public boolean getRequired() {
		    return required;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setContent( Content contentObject ) {
		    this.ContentObject = contentObject;
		  }

		  public void setRequired( boolean required ) {
		    this.required = required;
		  }
		}
		public class Content {
		  Application/json Application/jsonObject;
		  Application/xml Application/xmlObject;


		 // Getter Methods 

		  public Application/json getApplication/json() {
		    return Application/jsonObject;
		  }

		  public Application/xml getApplication/xml() {
		    return Application/xmlObject;
		  }

		 // Setter Methods 

		  public void setApplication/json( Application/json application/jsonObject ) {
		    this.Application/jsonObject = application/jsonObject;
		  }

		  public void setApplication/xml( Application/xml application/xmlObject ) {
		    this.Application/xmlObject = application/xmlObject;
		  }
		}
		public class Application/xml {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class Application/json {
		  Schema SchemaObject;


		 // Getter Methods 

		  public Schema getSchema() {
		    return SchemaObject;
		  }

		 // Setter Methods 

		  public void setSchema( Schema schemaObject ) {
		    this.SchemaObject = schemaObject;
		  }
		}
		public class Schema {
		  private String $ref;


		 // Getter Methods 

		  public String get$ref() {
		    return $ref;
		  }

		 // Setter Methods 

		  public void set$ref( String $ref ) {
		    this.$ref = $ref;
		  }
		}
		public class ExternalDocs {
		  private String description;
		  private String url;


		 // Getter Methods 

		  public String getDescription() {
		    return description;
		  }

		  public String getUrl() {
		    return url;
		  }

		 // Setter Methods 

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setUrl( String url ) {
		    this.url = url;
		  }
		}
		public class Info {
		  private String title;
		  private String description;
		  private String termsOfService;
		  Contact ContactObject;
		  License LicenseObject;
		  private String version;


		 // Getter Methods 

		  public String getTitle() {
		    return title;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String getTermsOfService() {
		    return termsOfService;
		  }

		  public Contact getContact() {
		    return ContactObject;
		  }

		  public License getLicense() {
		    return LicenseObject;
		  }

		  public String getVersion() {
		    return version;
		  }

		 // Setter Methods 

		  public void setTitle( String title ) {
		    this.title = title;
		  }

		  public void setDescription( String description ) {
		    this.description = description;
		  }

		  public void setTermsOfService( String termsOfService ) {
		    this.termsOfService = termsOfService;
		  }

		  public void setContact( Contact contactObject ) {
		    this.ContactObject = contactObject;
		  }

		  public void setLicense( License licenseObject ) {
		    this.LicenseObject = licenseObject;
		  }

		  public void setVersion( String version ) {
		    this.version = version;
		  }
		}
		public class License {
		  private String name;
		  private String url;


		 // Getter Methods 

		  public String getName() {
		    return name;
		  }

		  public String getUrl() {
		    return url;
		  }

		 // Setter Methods 

		  public void setName( String name ) {
		    this.name = name;
		  }

		  public void setUrl( String url ) {
		    this.url = url;
		  }
		}
		public class Contact {
		  private String email;


		 // Getter Methods 

		  public String getEmail() {
		    return email;
		  }

		 // Setter Methods 

		  public void setEmail( String email ) {
		    this.email = email;
		  }
		}
	

