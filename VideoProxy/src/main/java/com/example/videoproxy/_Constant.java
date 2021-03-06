package com.example.videoproxy;

/**
 * Created by Yongwei on 8/7/13.
 */
public class _Constant {

    public final static String JS_CALLER_PROTOCAL = "javascript:";

    public final static String GLOBAL_JS_VIDEO = "android_native_video";
    public final static String GLOBAL_JS_AUDIO = "android_native_audio";
    public final static String GLOBAL_JS_VIDEO_EVENT = "android_native_video_event";
    public final static String GLOBAL_JS_AUDIO_EVENT = "android_native_audio_event";

    public final static String VIDEO_EVENT_PLAY             = JS_CALLER_PROTOCAL + "%s" + ".play()";
    public final static String VIDEO_EVENT_PLAYING          = JS_CALLER_PROTOCAL + "%s" + ".playing()";
    public final static String VIDEO_EVENT_PAUSE            = JS_CALLER_PROTOCAL + "%s" + ".pause()";
    public final static String VIDEO_EVENT_ENDED            = JS_CALLER_PROTOCAL + "%s" + ".ended()";
    public final static String VIDEO_EVENT_SEEKED           = JS_CALLER_PROTOCAL + "%s" + ".seeked()";
    public final static String VIDEO_EVENT_LOADEDMETADATA   = JS_CALLER_PROTOCAL + "%s" + ".loadedmetadata()";
    public final static String VIDEO_EVENT_TIMEUPDATE       = JS_CALLER_PROTOCAL + "%s" + ".timeupdate(%f)";
    public final static String VIDEO_EVENT_DURATIONCHANGE   = JS_CALLER_PROTOCAL + "%s" + ".durationchange(%f)";

}
