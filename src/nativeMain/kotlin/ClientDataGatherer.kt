class ClientDataGatherer {
    var data: ClientData = ClientData()

    public fun getData(): ClientData {
        return this.data
    }
    public fun gatherData() {
        val os = System.getProperty("os.name").toLowerCase()
        when {
            os.contains("win") -> {
                OS.WINDOWS
            }

            os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
                OS.LINUX
            }

            os.contains("mac") -> {
                OS.MAC
            }

            os.contains("sunos") -> {
                OS.SOLARIS
            }

            else -> null
        }
    }
}