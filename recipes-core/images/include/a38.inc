IMAGE_INSTALL_append += "pru-icss pru-icss-staticdev clang"

ROOTFS_POSTPROCESS_COMMAND_append += " append_to_osrelease;"
