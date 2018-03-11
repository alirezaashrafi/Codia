# Codia
 [![](https://jitpack.io/v/alirezaashrafi/codia.svg)](https://jitpack.io/#alirezaashrafi/codia)
### Easy and Fast android - php - java Encryption Decryption library
 - Support UTF-8 Characters Arabic Chinese Farsi & .... Characters
 - Without adding additional characters
 - Extremely fast encrypt 100MB string per second
 - Optimized for JSON encryption
 - Min Sdk Version api 1
 #### Do not forget the star:)⭐️
<br>


<img src="https://raw.githubusercontent.com/alirezaashrafi/Codia/master/codia.jpg"/>


# [APK Demo](https://github.com/alirezaashrafi/Codia/raw/master/Demo/Codia.apk)



## <i class="icon-file"></i> How to download
#### Gradle
###### Add it in your root build.gradle at the end of repositories:
```java
    allprojects {
         repositories {
             ...
             maven { url 'https://jitpack.io' }
         }
    }
```
###### add this line to your module build.gradle dependecies block:
```java
    compile 'com.github.alirezaashrafi:codia:2.0.0'
```

### Maven
###### Add the JitPack repository to your build file
```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
```

###### Add the dependency

```xml
  <dependency>
    <groupId>com.github.alirezaashrafi</groupId>
    <artifactId>codia</artifactId>
    <version>2.0.0</version>
  </dependency>
```
---

# android & java example


```java
    Codia codia = new Codia("Your Own Private Key");

    String text = "Easy and Fast android - php - java Encryption Decryption library";
    String encoded = codia.encode(text);
    String decoded = codia.decode(encoded);
```


# php example
```php
    require_once __DIR__.'/lib/Codia.php';
    $codia = new Codia("Your Own Private Key");

    $text = "Easy and Fast android - php - java Encryption Decryption library";
    $encodedText = $codia->encode($text);
    $decodedText = $codia->decode($encodedText);

```
# kotlin example
```kt
    val text = "Easy and Fast android - php - java Encryption Decryption library"

    val codia = Codia("Your Own Private Key")
    val encodedText = codia.encode(text)
    val decodedText = codia.decode(encodedText)
```
# sample Encryption and Decryption process diagram
<img src="https://raw.githubusercontent.com/alirezaashrafi/Codia/master/diagram.jpg" width="50%"/>


---
## Licence
Copyright 2018 Alireza Ashrafi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


---
## Author
 - [Alireza Ashrafi](https://github.com/alirezaashrafi)
 - [web site : alirezaashrafi.ir](http://alirezaashrafi.ir)
 - [email : alirezaashrafi.pv@gmail.com](alirezaashrafi.pv@gmail.com)
 - Phone & Whatsapp +98 901 396 2648
 - [telegram : @dr_khaki](http://t.me/dr_khaki)

 ---
#### If you liked this library, do not forget to star and follow me ⭐️❤️️💙
#### [Eventually see my other libraries and projects](https://github.com/alirezaashrafi/)
