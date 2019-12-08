#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_plbear_imageandroid_base_ImageJNI_helloworld(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
