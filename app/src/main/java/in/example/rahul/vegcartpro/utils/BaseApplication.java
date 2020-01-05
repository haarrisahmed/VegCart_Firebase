package in.example.rahul.vegcartpro.utils;

import android.app.Application;
//  Used In payment Gateway mention in manifest
//  ...  <application
//        android:name=".utils.BaseApplication"  ...
public class BaseApplication extends Application {
    AppEnvironment appEnvironment;

    @Override
    public void onCreate() {
        super.onCreate();
        appEnvironment= AppEnvironment.SANDBOX;
    }
    public AppEnvironment getAppEnvironment(){
        return appEnvironment;
    }
   public void setAppEnvironment(AppEnvironment appEnvironment){
        this.appEnvironment = appEnvironment;
   }
}
