# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "ROS wrapper for the mobile robot control platform YP-Spur"
AUTHOR = "Atsushi Watanabe <atsushi.w@openspur.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@openspur.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ypspur_ros"
ROS_BPN = "ypspur_ros"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    trajectory-msgs \
    ypspur \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    trajectory-msgs \
    ypspur \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    trajectory-msgs \
    ypspur \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/openspur/ypspur_ros-release/archive/release/noetic/ypspur_ros/0.3.1-3.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ypspur_ros"
SRC_URI = "git://github.com/openspur/ypspur_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "1f13ba25431bb37cd39b6689d197f5603fc8df5d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}