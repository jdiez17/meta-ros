# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[cob-dashboard] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', 'Requires rqt-gui which depends on qt-gui which depends on qtbase which requires meta-qt5 to be included', '', d)}"
