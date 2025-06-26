package SomMiniGame.Player.Interface

interface SaveLoad : PlayerExtend {
    var isLoaded: Boolean

    fun save() {

    }

    fun load() {
        isLoaded = true
    }
}