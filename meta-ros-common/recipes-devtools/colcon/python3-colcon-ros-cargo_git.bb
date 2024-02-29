SUMMARY = "Extension for colcon to support cargo packages."

# TODO: no license available
LICENSE = "Unknown"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/colcon/colcon-ros-cargo;protocol=https;branch=main"

# Modify these as desired
PV = "0.1.2+git${SRCPV}"
SRCREV = "73289b2d4019432461180a0bcdf00cd7dead79f0"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "\
	python3-argcomplete \
	python3-colcon-core (>= 0.15.2) \
	python3-core \
	python3-toml"

PREFERRED_VERSION_python3-colcon-core = "0.15.2"

BBCLASSEXTEND += "native nativesdk"
