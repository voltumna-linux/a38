require recipes-core/images/voltumna-sde.inc
require include/a38.inc
require include/a38-sxe.inc

IMAGE_INSTALL_append += "ti-cgt-pru"

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="A38 Power-supply (Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
