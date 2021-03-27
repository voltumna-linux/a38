require recipes-core/images/voltumna-sre.bb
require include/a38.inc
require include/a38-sxe.inc

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="A38 Power-supply (Runtime)"
	MACHINE="${MACHINE}"
	__EOF__
}
