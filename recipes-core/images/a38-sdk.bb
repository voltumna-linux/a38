require recipes-core/images/voltumna-sdk.bb
require include/a38.inc

TOOLCHAIN_HOST_TASK_append += "nativesdk-ti-cgt-pru"

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="A38 Power-supply (Cross Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
