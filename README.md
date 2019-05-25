# molecules  

[![Build Status](https://travis-ci.com/floppylab/molecules.svg?branch=master)](https://travis-ci.com/floppylab/molecules) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.floppylab%3Amolecules&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.floppylab%3Amolecules)

A library of useful Java classes. You can use them as part of your entities, too.

## what is it all about?

Think about a person. Now try to make a Person class. I guess you would craft something like this:

```java

public class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;    
}

```

Can you see that we have these properties: name and email addess, but we have to map them to types like String, Date, etc.
And do not forget about validating these data in the service layer....

So instead of these, why can't we have a Name or an Email types? And these types should know what is a valid email address or what is the maximum length of a name.

By using molecules, your Person class could look like this:

```java

public class Person {
    private Name firstName;
    private Name lastName;
    private BirthDate birthDate;
    private Email email;    
}

```
Isn't it better? :)

Do you like the idea? Check out all the [molecules](#what-molecules-are-available) or [help](CONTRIBUTING.md)! :)

## what molecules are available?

Currently, these molecules are available within the following packages:

* [Personal](src/main/java/com/floppylab/molecules/personal)
  * [Name](src/main/java/com/floppylab/molecules/personal#name)
  * [NotEmptyName](src/main/java/com/floppylab/molecules/personal#notemptyname)
* [Contact](src/main/java/com/floppylab/molecules/contact)
  * [Email](src/main/java/com/floppylab/molecules/contact#email)
  
## how to use them?

Well, at the moment you can clone or download this repository, build it and you can install it as a third party package.
Later on, I'm planning to upload it as an artifact to the Maven Central Repository.
