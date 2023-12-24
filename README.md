# AdTrace OAID Sample for Flutter

## Steps:
### 1. implement SDK [as usual](https://github.com/adtrace/adtrace_sdk_flutter)
### 2. add OAID android plugin to your android native module.
- add maven dependency for [`adtrace-android-oaid`](https://central.sonatype.com/artifact/io.adtrace/adtrace-android-oaid)
- add `oaid_sdk` as a [local `aar`](https://github.com/adtrace/adtrace_sdk_android/tree/master/android-sdk-plugin-oaid/libs) to your project (`libs` folder in `app`) 
### 3. call `AdTraceOaid.readOaid(context)` like below.

```java
...
import io.adtrace.sdk.oaid.AdTraceOaid;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AdTraceOaid.readOaid(this);
    }
}
```