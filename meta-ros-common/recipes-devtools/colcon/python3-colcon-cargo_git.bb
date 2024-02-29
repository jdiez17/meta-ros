SUMMARY = "Extension for colcon to support cargo packages."

# TODO no license available
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/colcon/colcon-cargo;protocol=https;branch=main"

# Modify these as desired
PV = "0.1.2+git${SRCPV}"
SRCREV = "6607ddbf5b04753670d29c30f255cadd99f0b50d"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "\
	python3-argcomplete \
	python3-colcon-core (>= 0.15.2) \
	python3-core \
	python3-toml"

BBCLASSEXTEND += "native nativesdk"
