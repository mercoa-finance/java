# Mercoa Java Library

![Maven Central](https://img.shields.io/maven-central/v/com.mercoa/mercoa) 
![Sonatype Nexus (Releases)](https://img.shields.io/nexus/r/com.mercoa/mercoa?server=https%3A%2F%2Fs01.oss.sonatype.org)
[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-SDK%20generated%20by%20Fern-brightgreen)](https://github.com/fern-api/fern)

## Documentation

API documentation is available at <https://docs.mercoa.com>.

## Installation

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation 'com.mercoa:mercoa:0.0.1751'
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mercoa</groupId>
    <artifactId>mercoa</artifactId>
    <version>0.0.1751</version>
</dependency>
```

## Usage

```java

MercoaApiClient client = MercoaApiClient.builder()
        .authKey(System.getenv("MERCOA_API_KEY"))
        .build();

var response = client.entity().get("YOUR_ENTITY_ID");

System.out.println(response.getId());
```

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning the package version to a specific version in your build.gradle file. This way, you can install the same version each time without breaking changes unless you are intentionally looking for the latest version.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. Additions made directly to this library would have to be moved over to our generation code, otherwise they would be overwritten upon the next generated release. Feel free to open a PR as a proof of concept, but know that we will not be able to merge it as-is. We suggest [opening an issue](https://github.com/mercoa-finance/java) first to discuss with us!

On the other hand, contributions to the README are always very welcome!
