package com.cloudfy.warInstructions.content

import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.entities.Paragraph
import com.cloudfy.warInstructions.entities.Subchapter

object ChaptersManager {
    val chapters: ArrayList<Chapter> = ArrayList()

    private val chapterOne: Chapter = Chapter(
        1,
        title = "La patría y la bandera"
        , index = 1
        , subchapters = arrayListOf(
            Subchapter(title = "La patría y la bandera", index = 1,
                content = arrayListOf(
                 Paragraph(content = "La patria es el pais en que se ha nacido. Para los españoles, la patria es España, con todos los territorios que la integran. No es solamente el pedazo de tierra que los vió nacer: es toda la Nación española."),
                    Paragraph(content = "Forman parte también de esta Patria lo buques de guerra o mercantes que ostenten la bandera española, aún cuando naveguen por los mares más lejanos"),
                    Paragraph(content = "La patria es todo el raudal de la tradición de un pueblo y todo el firmamento de su esperanza (Maura.)"),
                    Paragraph(content = "La patria es la imagen de una vasta familia (Campoamor.)"),
                    Paragraph(content = "España es una nación toda gloria e ideal, entusiasmo vibrante y noble bravura. (Andrés Piquemal, militar francés.)"),
                    Paragraph(content = "Desde que he visto al español en su patria comprendo mejor su orgullo, su frugalidad, su templanza y su entereza. (Washington Irving, literario norteamericano.)")
                    )
                ),
            Subchapter(title = "El amor a la patría", index = 2,
                content = arrayListOf(
                    Paragraph(content = "No puede concebirse la existencia de un hombre que no ame a su Patria. El que no es capaz de amarla lo es de aborrecer a su madre; es indigno de pertener a la especie humana"),
                    Paragraph(content = "Los pueblos más incultos de la Tierra, las razas más desdichadas, desde que el mundo existe , han experimentado el impulso irresistible del patriotismo. Aún aquellos que viven en tierras estériles " +
                        "e ingratas, bajo climas crudos aislados del resto de los mortales, luchando de continuo con el hambre, aman apasionadamente a su Patria. Son como aquellos hijos" +
                        "a quienes el amor a su madre no les permite ver sus defectos."),
                    Paragraph(content = "El patriotismo es un sentimiento fuerte y dulce que espontáneamente siente todo ciudadano digno de este nombre"),
                    Paragraph(content = "Vuestro pueblo forma parte integrante de vuestra Patria, y ese sentimiento de amor que experimentaís ha d eimpulsaros a conservar esa virtud que se llama patriotismo, la más esencial" +
                        "en todo buen ciudadano"),
                    Paragraph(content = "El amor a la Patria es un gran principio que nace con toda hombre. (Ros De Olano.)" ),
                    Paragraph(content = "Con laPatria se está, con razón y sin ella , como se está con el padre y con la madre. (Cánovas.)"),
                    Paragraph(content = "No se ama a la Patria porque es grande, sino porque es nuestra. (Séneca.)")

                )),
            Subchapter(title = "Deberes del hombre para con la patría", index = 3),
            Subchapter(title = "La bandera", index = 4)

        )
    )

    private val chapterTwo: Chapter = Chapter(
        2,
        title = "La Marina"
        , index = 2
        , subchapters = arrayListOf(
            Subchapter(title = "¿Qué es la Marina?", index = 1),
            Subchapter(title = "importancia de la Marina de guerra", index = 2),
            Subchapter(title = "Lo que ha hecho la Marina española", index = 3),
            Subchapter(title = "La bandera", index = 4)

        )
    )
    private val chapterThree: Chapter = Chapter(
        3,
        title = "Las virtudes del marinero"
        , index = 3
        , subchapters = arrayListOf(
            Subchapter(title = "Disciplina", index = 1),
            Subchapter(title = "Subordinación", index = 2),
            Subchapter(title = "Obediencia", index = 3),
            Subchapter(title = "Valor", index = 4),
            Subchapter(title = "Lealtad", index = 5),
            Subchapter(title = "Honradez", index = 6)

        )
    )
    private val chapterFour: Chapter = Chapter(
        4,
        title = "La instrucción militar"
        , index = 4
        , subchapters = arrayListOf(
            Subchapter(title = "Posición militar del marinero", index = 1),
            Subchapter(title = "Descanso en su lugar", index = 2),
            Subchapter(title = "Movimientos de cabeza", index = 3),
            Subchapter(title = "Giros a pie firme", index = 4),
            Subchapter(title = "Marchar: distintos pasos", index = 5),
            Subchapter(title = "Giros y cambios de dirección", index = 6),
            Subchapter(title = "Instrucción con armas",  index = 7),
            Subchapter(title = "Posición de firmes", index = 8),
            Subchapter(title = "Descanso en su lugar", index = 9),
            Subchapter(title = "Presentar el arma", index = 10),
            Subchapter(title = "Arma sobre el hombro", index = 11),
            Subchapter(title = "Suspender el arma", index = 12),
            Subchapter(title = "Colgar las armas", index = 13),
            Subchapter(title = "Armar y envainar el cuchillo", index = 14),
            Subchapter(title = "Echar a tierra el arma", index = 15),
            Subchapter(title = "Marchar con armas", index = 16),
            Subchapter(title = "Marchar con el arma al hombro o suspendida", index = 17),
            Subchapter(title = "Arma a la funerala", index = 18),
            Subchapter(title = "Alineaciones", index = 19),
            Subchapter(title = "Formación en fila", index = 20),
            Subchapter(title = "Formación en comumna", index = 21),
            Subchapter(title = "Deshacer y restablecer la formación", index = 22),
            Subchapter(title = "Revistas y desfiles", index = 23),
            Subchapter(title = "Revista de armas", index = 24)
        )
    )
    private val chapterFive: Chapter = Chapter(
        5,
        title = "Instrucción de campaña"
        , index = 5
        , subchapters = arrayListOf(
            Subchapter(title = "El tiro de fusil", index = 1),
            Subchapter(title = "Idea general sobre el fenómeno del tiro", index = 2),
            Subchapter(title = "Manejo del alza", index = 3),
            Subchapter(title = "Posiciones del tirador", index = 4),
            Subchapter(title = "Cargar y montar el arma", index = 5),
            Subchapter(title = "Ponder el seguro", index = 6),
            Subchapter(title = "Graduar el alza", index = 7),
            Subchapter(title = "Apuntar", index = 8),
            Subchapter(title = "Retirar las armas estando apuntadas", index = 9),
            Subchapter(title = "Hacer fuego", index = 10),
            Subchapter(title = "Descargar el fusil o mosquetón", index = 11),
            Subchapter(title = "Descansar el arma", index = 12)
        )
    )
    private val chapterSix: Chapter = Chapter(
        6,
        title = "El tiro con granadas de mano y de fusil"
        , index = 6
        , subchapters = arrayListOf(
            Subchapter(title = "Características técnicas", index = 1),
            Subchapter(title = "Lanzamiento de a granada de mano", index = 2),
            Subchapter(title = "Posiciones del lanzador", index = 3),
            Subchapter(title = "Preparar la granada", index = 4),
            Subchapter(title = "El lanzamiento", index = 5),
            Subchapter(title = "La granada de fusil", index = 6),
            Subchapter(title = "Preparar el arma",  index = 7),
            Subchapter(title = "Apuntar el arma", index = 8),
            Subchapter(title = "Observaciones", index = 9),
            Subchapter(title = "Utilización del terreno", index = 10),
            Subchapter(title = "Trincheras", index = 11)
        )
    )
    private val chapterSeven: Chapter = Chapter(
        7,
        title = "Protección contra los gases de combate"
        , index = 7
        , subchapters = arrayListOf(
            Subchapter(title = "Generalidades",  index = 1),
            Subchapter(title = "Principales gases de combate", index = 2),
            Subchapter(title = "Métodos de ataque empleados", index = 3),
            Subchapter(title = "Cómo se efectua la protección contra gases", index = 4),
            Subchapter(title = "Auxilio a los accidentados", index = 5)
        )
    )
    private val chapterEight: Chapter = Chapter(
        8,
        title = "Obligaciones generales del centinela"
        , index = 8
        , subchapters = arrayListOf(
            Subchapter(title = "Importancia de la misión del centinela",  index = 1),
            Subchapter(title = "Obligaciones del centinela", index = 2),
            Subchapter(title = "Idem del vigilante", index = 3)
        )
    )
    private val chapterNine: Chapter = Chapter(
        9,
        title = "El saludo militar"
        , index = 9
        , subchapters = arrayListOf(
            Subchapter(title = "Generalidades", index = 1),
            Subchapter(title = "Cómo se hace el saludo", index = 2),
            Subchapter(title = "Saludo con armas", index = 3),
            Subchapter(title = "Aclaraciones sobre el saludo",  index = 4),
            Subchapter(title = "Cuándo no se saluda", index = 5),
            Subchapter(title = "Otras muestras de la cortesía militar", index = 6)
        )
    )
    private val chapterTen: Chapter = Chapter(
        10,
        title = "Las jerarquías en la Marina y en el Ejército"
        , index = 10
        , subchapters = arrayListOf(
            Subchapter(title = "Los que integran la marina",  index = 1),
            Subchapter(title = "Empleos y divisas del Ejército", index = 2)
        )
    )
    fun addChapters() {
        chapters.add(chapterOne)
        chapters.add(chapterTwo)
        chapters.add(chapterThree)
        chapters.add(chapterFour)
        chapters.add(chapterFive)
        chapters.add(chapterSix)
        chapters.add(chapterSeven)
        chapters.add(chapterEight)
        chapters.add(chapterNine)
        chapters.add(chapterTen)


    }
}