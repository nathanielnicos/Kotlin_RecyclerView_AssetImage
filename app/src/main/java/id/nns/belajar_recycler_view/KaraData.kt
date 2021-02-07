package id.nns.belajar_recycler_view

object KaraData {
    private val karaNames = arrayOf(
            "Delta (I)",
            "Kashin Koji (II)",
            "Boro (III)",
            "Jigen (IV)",
            "Kawaki (IX)",
            "Amado",
            "Isshiki Otsutsuki"
    )

    private val karaDetails = arrayOf(
            "Delta (デルタ, Deruta) is an Inner from the organisation Kara.",
            "Koji Kashin (果心居士, Kashin Koji) is a clone of Jiraiya that was created by Amado for the purpose of killing Isshiki Ōtsutsuki. As a former Inner of Kara, he was in charge of the sector on the outskirts of the Land of Fire.",
            "Boro (ボロ, Boro) was an Inner from the organisation Kara.",
            "Jigen (ジゲン, Jigen) was a novice monk that became the vessel for Isshiki Ōtsutsuki, and eventually had his body completely taken over by Isshiki invading it.",
            "Kawaki (カワキ, Kawaki) is a child raised by Kara to be the future vessel for Isshiki Ōtsutsuki and the key to the fulfilment of their greatest wish. After being brought to Konohagakure by Team 7, he is taken in by Naruto Uzumaki who raises him as his own, during which he develops a brotherly bond with Boruto Uzumaki to solve the mystery of Kāma.",
            "Amado (アマド, Amado) is a former Inner from the organisation Kara and the head of its research and development division. He has since defected to Konohagakure, where he used a mix of bluffs and gifts to gain official citizenship for the Hokage\'s protection.",
            "Isshiki Ōtsutsuki (大筒木イッシキ, Ōtsutsuki Isshiki) was a member of the Ōtsutsuki clan\'s main family and the leader of Kara."
    )

    private val karaImages = intArrayOf(
            R.drawable.delta,
            R.drawable.koji,
            R.drawable.boro,
            R.drawable.jigen,
            R.drawable.kawaki,
            R.drawable.amado,
            R.drawable.isshiki
    )

    val listData: ArrayList<Kara>

    get() {
        val list = arrayListOf<Kara>()
        for (position in karaNames.indices) {
            val kara = Kara()
            kara.name = karaNames[position]
            kara.detail = karaDetails[position]
            kara.photo = karaImages[position]
            list.add(kara)
        }
        return list
    }
}