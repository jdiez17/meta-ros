# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Eclipse iceoryx inter-process-communication (IPC) middleware C-Language Binding"
AUTHOR = "Eclipse Foundation, Inc. <michael.poehnl@apex.ai>"
HOMEPAGE = "https://iceoryx.io"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=80318c4afef111a7690eaf237460856b"

ROS_CN = "iceoryx"
ROS_BPN = "iceoryx_binding_c"

ROS_BUILD_DEPENDS = " \
    iceoryx-posh \
    iceoryx-utils \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ApexAI/iceoryx-release/archive/release/rolling/iceoryx_binding_c/0.99.7-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/iceoryx_binding_c"
SRC_URI = "git://github.com/ApexAI/iceoryx-release;${ROS_BRANCH};protocol=https"
SRCREV = "3196b7d5186313cf79388e3f4a85514591cb6cd3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
