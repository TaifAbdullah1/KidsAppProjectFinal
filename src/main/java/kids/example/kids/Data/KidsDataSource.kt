package kids.example.kids.Data

import com.example.kids.R

class KidsDataSource {

    companion object {

        fun createCountriesList(): List<Kids> {
            return listOf(
                Kids(
                    "ALPHABETS",
                    "Lesson1",
                    R.drawable.picture4,
                    "If you visit only one place in Saudi-Arabia, let it be AlUla and its heritage gem Hegra (also known as Madain Saleh). The other-worldly scenery, breath taking nature, and rich history make it a destination worth exploring for many days. Hegra is not only the tombs of the ancient Nabatean people and Saudi Arabia’s first UNESCO listed world heritage site, but it offers much more for the tourist to explore.",
                    "https://www.youtube.com/watch?v=U2yznF7grks",
                    "https://teach.starfall.com/lv/global/documents/downloads/bl-abc.pdf"),
                Kids(
                    "NUMBERS",
                    "Lesson2",
                    R.drawable.picture3,
                    "Najran The colorful city of Najran on the Yemeni border offers an unforgettable experience for travelers. Its unique history, architecture and culture blends in with the neighboring Yemen. Najran is a very tourist friendly destination in Saudi-Arabia that pleases even the most experienced traveler. Inscribed as Saudi Arabia’s UNESCO heritage site in 2021, the Hima Rock Art site is located in Najran.",
                    "https://www.youtube.com/watch?v=qDSCBZoWDvk",
                    "https://kidsstudyhub.com/wp-content/uploads/2022/01/number-5.pdf"),
                Kids(
                    "COLORS",
                    "Lesson3",
                    R.drawable.picture1,
                    "Empty Quarter It is not empty. It is full of beauty, silence, wildlife and tranquility.",
                    "https://www.youtube.com/watch?v=8LYGccaLxWo",
                    "https://i.pinimg.com/736x/5d/6d/ee/5d6dee263d7e131609c5f74aaffcb9cc--preschool-colors-teaching-colors.jpg"),
                Kids(
                    "ANIMAL ",
                    "Lesson4",
                    R.drawable.picture2,
                    "Al Soudah The Asir National Park and the Al-Soudah area near Abha are a lush, breezy paradise best visited in the hot summer months. The park offers trekking, camping sites, cable cars, and plenty of other outdoor activities in addition to interesting architecture and friendly people.",
                    "https://www.youtube.com/watch?v=Ur4BLn8w8FU"
                , "https://kidsstudyhub.com/wp-content/uploads/2022/01/domesticanimalschart.pdf"),



            )

        }

    }

}