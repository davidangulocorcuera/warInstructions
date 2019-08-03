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
            Subchapter(
                title = "La patría y la bandera", index = 1,
                content = arrayListOf(
                    Paragraph(content = "La patria es el pais en que se ha nacido. Para los españoles, la patria es España, con todos los territorios que la integran. No es solamente el pedazo de tierra que los vió nacer: es toda la Nación española."),
                    Paragraph(content = "Forman parte también de esta Patria lo buques de guerra o mercantes que ostenten la bandera española, aún cuando naveguen por los mares más lejanos"),
                    Paragraph(content = "La patria es todo el raudal de la tradición de un pueblo y todo el firmamento de su esperanza (Maura.)"),
                    Paragraph(content = "La patria es la imagen de una vasta familia (Campoamor.)"),
                    Paragraph(content = "España es una nación toda gloria e ideal, entusiasmo vibrante y noble bravura. (Andrés Piquemal, militar francés.)"),
                    Paragraph(content = "Desde que he visto al español en su patria comprendo mejor su orgullo, su frugalidad, su templanza y su entereza. (Washington Irving, literario norteamericano.)")
                )
            ),
            Subchapter(
                title = "El amor a la patría", index = 2,
                content = arrayListOf(
                    Paragraph(content = "No puede concebirse la existencia de un hombre que no ame a su Patria. El que no es capaz de amarla lo es de aborrecer a su madre; es indigno de pertener a la especie humana"),
                    Paragraph(
                        content = "Los pueblos más incultos de la Tierra, las razas más desdichadas, desde que el mundo existe , han experimentado el impulso irresistible del patriotismo. Aún aquellos que viven en tierras estériles " +
                                "e ingratas, bajo climas crudos aislados del resto de los mortales, luchando de continuo con el hambre, aman apasionadamente a su Patria. Son como aquellos hijos" +
                                "a quienes el amor a su madre no les permite ver sus defectos."
                    ),
                    Paragraph(content = "El patriotismo es un sentimiento fuerte y dulce que espontáneamente siente todo ciudadano digno de este nombre"),
                    Paragraph(
                        content = "Vuestro pueblo forma parte integrante de vuestra Patria, y ese sentimiento de amor que experimentaís ha d eimpulsaros a conservar esa virtud que se llama patriotismo, la más esencial" +
                                "en todo buen ciudadano"
                    ),
                    Paragraph(content = "El amor a la Patria es un gran principio que nace con toda hombre. (Ros De Olano.)"),
                    Paragraph(content = "Con laPatria se está, con razón y sin ella , como se está con el padre y con la madre. (Cánovas.)"),
                    Paragraph(content = "No se ama a la Patria porque es grande, sino porque es nuestra. (Séneca.)")

                )
            ),
            Subchapter(title = "Deberes del hombre para con la patría", index = 3),
            Subchapter(title = "La bandera", index = 4)

        )
    )

    private val chapterTwo: Chapter = Chapter(
        2,
        title = "La Marina"
        , index = 2
        , subchapters = arrayListOf(
            Subchapter(
                title = "¿Qué es la Marina?", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "importancia de la Marina de guerra", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Lo que ha hecho la Marina española", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "La bandera", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )

        )
    )
    private val chapterThree: Chapter = Chapter(
        3,
        title = "Las virtudes del marinero"
        , index = 3
        , subchapters = arrayListOf(
            Subchapter(
                title = "Disciplina", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Subordinación", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Obediencia", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Valor", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Lealtad", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Honradez", index = 6,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )

        )
    )
    private val chapterFour: Chapter = Chapter(
        4,
        title = "La instrucción militar"
        , index = 4
        , subchapters = arrayListOf(
            Subchapter(
                title = "Posición militar del marinero", index = 1
                ,
                content = arrayListOf(
                    Paragraph(content = "Es la posición de 'firmes', que puede ser sin armas o con ellas."),
                    Paragraph(content = "Condición fundamental de esta posición es la inmovilidad absoluta. Es éste uno de los detalles en donde más se destaca la buena insrucción de una tropa."),
                    Paragraph(content = "Son vicios frecuentes en una instrucción defectuosa los movimientos intempestivos de los individuos que componen una formación. Rascarse, espantarse las moscas, sujetarse el gorro, sonarse, escupir y toser" +
                                " son las faltas más comunes, que, como todas las que alteren la quietud y el silencio en una formación, deben evitarse"),
                    Paragraph(content = "El superior que os mande en ella procurará que la posición de firmes dure lo menos posile, atendiendo a que durante ella os exigirá la innmovilidad y el silencio más absolutos."),
                    Paragraph(content = "Esta posición se adoptará al dar el superior la voz de 'Firmes'. Se dice también cuadrarse a esta posición, que se expone a continuación:\nLos talones, unidos, o lo más próximos que sea posible," +
                            " si no lo permite la configuración del individuo. Los pies, con las puntas hacia adelante ,formando ángulo, de manera que queden aproximadamente perpendiulares. Las piernas, extendidas. El peso del cuerpo," +
                            " soportado por igual por ambas. El pecho saliente, cuidado de no sacar  el vientre. Los hombros, retirados por igual hacia atrás. Los razos, extendidos, sin unir los codos al cuerpo. Las manos, ligeramente extenidas," +
                            " con las palmas hacia atrás, tocando con los dedos índices las costuras exteriores del pantalón. La cabeza, derecha, erguida, sin sacar la barba. La vista, al frente.")
                )
            ),
            Subchapter(
                title = "Descanso en su lugar", index = 2
                ,
                content = arrayListOf(
                    Paragraph(content = "De la posición de firmes se pasará a la de descanso cuando se oigan las siguientes voces:\nPrimera. 'En su lugar'.\nSegunda. 'Descanso'."),
                    Paragraph(content = "A la segunda voz, sin modificar la situación del pie izquierdo, y sin varias la dirección del derecho, se llevará éste atrás y un poco a la derecha, hasta que su talón diste un pie del izquierdo," +
                            " doblando ligeramente la rodilla izquierda; al mismo tiempo se colocará la mano derecha por delante del cuerpo con la palma vuelta hacia él, y  sobre ella la izquierda en igual dispocición, dejando los brazos naturalmente tendidos."),
                    Paragraph(content = "En esta posición el marinero podrá moverse con libertad, pero conservando siempre uno de los pies en la línea de formación , de manera que para separar el pie izquierdo habrá de cuadrarse previamente y colocar en ella el derecho."),
                    Paragraph(content = "Si el descanso ha de ser a discrección, se darán las voces siguientes:\nPrimera. 'A discreción'.\nSegunda. 'Descanso'.\nEl movimiento es como el anterior; pero tendrá el marinero libertad para hablar en voz baja."),
                    Paragraph(content = "Para pasar de la posición de descanso a la de firmes se darán las voces:\nPrimera. 'Recluta' (o pelotón, o sección, etc.).\nSegunda. 'Firmes'.\nAl oir la primera, el marinero carga el peso del cuerpo sobre el pie que tenga delante," +
                            " enderezará la pierna correspondiente y, elevando el talón del pie retrasado, esperará hasta oir la segunda voz. Cuando la oiga, llevará el pie retrasado al frente, quedando cuadrado.\nMuchas veces se omite la primera voz" +
                            " y al oir la de firmes se harán los movimientos anteriores seguidos.")
                )
            ),
            Subchapter(
                title = "Movimientos de cabeza", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Giros a pie firme", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Marchar: distintos pasos", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Giros y cambios de dirección", index = 6,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Instrucción con armas", index = 7,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Posición de firmes", index = 8,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Descanso en su lugar", index = 9,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Presentar el arma", index = 10,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Arma sobre el hombro", index = 11,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Suspender el arma", index = 12,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Colgar las armas", index = 13,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Armar y envainar el cuchillo", index = 14,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Echar a tierra el arma", index = 15,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Marchar con armas", index = 16,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(title = "Marchar con el arma al hombro o suspendida", index = 17),
            Subchapter(
                title = "Arma a la funerala", index = 18,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Alineaciones", index = 19,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Formación en fila", index = 20,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Formación en comumna", index = 21,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Deshacer y restablecer la formación", index = 22,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Revistas y desfiles", index = 23,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Revista de armas", index = 24,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterFive: Chapter = Chapter(
        5,
        title = "Instrucción de campaña"
        , index = 5
        , subchapters = arrayListOf(
            Subchapter(
                title = "El tiro de fusil", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Idea general sobre el fenómeno del tiro", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Manejo del alza", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Posiciones del tirador", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Cargar y montar el arma", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Ponder el seguro", index = 6,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Graduar el alza", index = 7,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Apuntar", index = 8,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Retirar las armas estando apuntadas", index = 9,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Hacer fuego", index = 10,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Descargar el fusil o mosquetón", index = 11,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Descansar el arma", index = 12,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterSix: Chapter = Chapter(
        6,
        title = "El tiro con granadas de mano y de fusil"
        , index = 6
        , subchapters = arrayListOf(
            Subchapter(
                title = "Características técnicas", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Lanzamiento de a granada de mano", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Posiciones del lanzador", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Preparar la granada", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "El lanzamiento", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "La granada de fusil", index = 6,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Preparar el arma", index = 7,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Apuntar el arma", index = 8,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Observaciones", index = 9,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Utilización del terreno", index = 10,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Trincheras", index = 11,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterSeven: Chapter = Chapter(
        7,
        title = "Protección contra los gases de combate"
        , index = 7
        , subchapters = arrayListOf(
            Subchapter(
                title = "Generalidades", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Principales gases de combate", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Métodos de ataque empleados", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Cómo se efectua la protección contra gases", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Auxilio a los accidentados", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterEight: Chapter = Chapter(
        8,
        title = "Obligaciones generales del centinela"
        , index = 8
        , subchapters = arrayListOf(
            Subchapter(
                title = "Importancia de la misión del centinela", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Obligaciones del centinela", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Idem del vigilante", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterNine: Chapter = Chapter(
        9,
        title = "El saludo militar"
        , index = 9
        , subchapters = arrayListOf(
            Subchapter(
                title = "Generalidades", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Cómo se hace el saludo", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Saludo con armas", index = 3,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Aclaraciones sobre el saludo", index = 4,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Cuándo no se saluda", index = 5,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Otras muestras de la cortesía militar", index = 6,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
        )
    )
    private val chapterTen: Chapter = Chapter(
        10,
        title = "Las jerarquías en la Marina y en el Ejército"
        , index = 10
        , subchapters = arrayListOf(
            Subchapter(
                title = "Los que integran la marina", index = 1,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            ),
            Subchapter(
                title = "Empleos y divisas del Ejército", index = 2,
                content = arrayListOf(
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = ""),
                    Paragraph(content = "")
                )
            )
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