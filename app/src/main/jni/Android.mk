LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := dm_api20
LOCAL_SRC_FILES := daemon_api20.c \
	common.c
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog -lm -lz
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE    := dm_api21
LOCAL_SRC_FILES := daemon_api21.c \
	common.c
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog -lm -lz
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE    := svboot
LOCAL_SRC_FILES := monkey.c
LOCAL_CFLAGS += -pie -fPIE
LOCAL_LDFLAGS += -pie -fPIE
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_LDLIBS += -L$(SYSROOT)/usr/lib -llog -lm -lz
include $(BUILD_EXECUTABLE)

