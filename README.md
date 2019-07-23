# <img alt="App image" src="app/src/main/res/drawable/messageicon.png" width="5%"> MessageMe


## Overview

Do you want to stay connected to your love ones???

Have a look at MessageMe app build java support 
It is a simple text messaging app to send sms. One EditText hold the mobile no. and other holds the message. If any of the EditText remain blank then then `Send` button will remain `disabled` (will not work). If both the EditText are been filled then `Send` button will be `enabled` now due to `TextChangeListener`. Exit button is used for closing the app. Send and Exit button works due to `OnClickListener` To use any services like calling or sending message etc we need to provide permission to our app. So we need to modify our `Manifest File` and write `<uses-permission android:name="android.permission.SEND_SMS" />`
## Features

* OnClickListener
* EditText
* Button
* Layout for EditText Boarder
* TextChangeListener
* Layout For EditText Cursor
## Platform
        -> Android Studio
        -> With JAVA

## Accessing tips :

1. Clone or download the repository: `https://github.com/vishalvs9728/MessagingAPP`
2. Navigate to the folder `app` Folder
3. Navigate to the folder `MessagingAPP/app/src/` to access developers content
3. Navigate to the folder `APK` for users to access apk
4. Copy the apk from folder `APK` to an android phone
5. Install the apk

The app is finally installed on your Android mobile device !!

To directly download the apk [Click Here]( https://github.com/vishalvs9728/MessagingAPP/blob/master/APK/MessageMe.apk)

 # Screenshots:

<div style="display:flex;">
<img alt="App image" src="Screenshot_20190723-201747.png" width="30%" hspace="10">
<img alt="App image" src="Screenshot_20190723-201755.png" width="30%" hspace="10">
</div>
<br/>
<br/>
<div style="display:flex;">
<img alt="App image" src="Screenshot_20190723-201805.png" width="30%" hspace="10">
<img alt="App image" src="Screenshot_20190723-201809.png" width="30%" hspace="10">
</div>

## Resources, Activities and Manifest for the Application

For Java File [Click here]( https://github.com/vishalvs9728/MessagingAPP/blob/master/app/src/main/java/com/example/vishalsingh/textmessenger/MainActivity.java)

Resource files are stored in `res` package

* [res](https://github.com/vishalvs9728/MessagingAPP/tree/master/app/src/main/res)

Android manifest file for the project:

* [AndroidManifest.xml]( https://github.com/vishalvs9728/MessagingAPP/blob/master/app/src/main/AndroidManifest.xml)


