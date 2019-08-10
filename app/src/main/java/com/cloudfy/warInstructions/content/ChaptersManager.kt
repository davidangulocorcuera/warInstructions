package com.cloudfy.warInstructions.content

import com.cloudfy.warInstructions.entities.Chapter
import com.cloudfy.warInstructions.entities.Subchapter

object ChaptersManager {
    val chapters: ArrayList<Chapter> = ArrayList()

    private val chapterOne: Chapter = Chapter(
        1,
        title = "La Patria y la Bandera"
        , index = 1
        , subchapters = arrayListOf(
            Subchapter(
                title = "La Patria y la Bandera", index = 1,
                paragrahps = arrayListOf(
                )
            ),
            Subchapter(
                title = "El amor a la patría", index = 2,
                paragrahps = arrayListOf(
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
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "importancia de la Marina de guerra", index = 2,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Lo que ha hecho la Marina española", index = 3,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "La bandera", index = 4,
                paragrahps = arrayListOf(

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
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Subordinación", index = 2,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Obediencia", index = 3,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Valor", index = 4,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Lealtad", index = 5,
                paragrahps = arrayListOf(

                )
            ),
            Subchapter(
                title = "Honradez", index = 6,
                paragrahps = arrayListOf(

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
                paragrahps = arrayListOf(
                    "Es la posición de 'firmes', que puede ser sin armas o con ellas.",
                    "Condición fundamental de esta posición es la inmovilidad absoluta. Es éste uno de los detalles en donde más se destaca la buena insrucción de una tropa.",
                    "Son vicios frecuentes en una instrucción defectuosa los movimientos intempestivos de los individuos que componen una formación. Rascarse, espantarse las moscas, sujetarse el gorro, sonarse, escupir y toser" +
                            " son las faltas más comunes, que, como todas las que alteren la quietud y el silencio en una formación, deben evitarse",
                    "El superior que os mande en ella procurará que la posición de firmes dure lo menos posile, atendiendo a que durante ella os exigirá la innmovilidad y el silencio más absolutos.",
                    "Esta posición se adoptará al dar el superior la voz de 'Firmes'. Se dice también cuadrarse a esta posición, que se expone a continuación:\nLos talones, unidos, o lo más próximos que sea posible," +
                            " si no lo permite la configuración del individuo. Los pies, con las puntas hacia adelante ,formando ángulo, de manera que queden aproximadamente perpendiulares. Las piernas, extendidas. El peso del cuerpo," +
                            " soportado por igual por ambas. El pecho saliente, cuidado de no sacar  el vientre. Los hombros, retirados por igual hacia atrás. Los razos, extendidos, sin unir los codos al cuerpo. Las manos, ligeramente extenidas," +
                            " con las palmas hacia atrás, tocando con los dedos índices las costuras exteriores del pantalón. La cabeza, derecha, erguida, sin sacar la barba. La vista, al frente."
                )
            ),
            Subchapter(
                title = "Descanso en su lugar", index = 2
                ,
                paragrahps = arrayListOf(
                    "De la posición de firmes se pasará a la de descanso cuando se oigan las siguientes voces:\nPrimera. 'En su lugar'.\nSegunda. 'Descanso'.",
                    "A la segunda voz, sin modificar la situación del pie izquierdo, y sin varias la dirección del derecho, se llevará éste atrás y un poco a la derecha, hasta que su talón diste un pie del izquierdo," +
                            " doblando ligeramente la rodilla izquierda; al mismo tiempo se colocará la mano derecha por delante del cuerpo con la palma vuelta hacia él, y  sobre ella la izquierda en igual dispocición, dejando los brazos naturalmente tendidos.",
                    "En esta posición el marinero podrá moverse con libertad, pero conservando siempre uno de los pies en la línea de formación , de manera que para separar el pie izquierdo habrá de cuadrarse previamente y colocar en ella el derecho.",
                    "Si el descanso ha de ser a discrección, se darán las voces siguientes:\nPrimera. 'A discreción'.\nSegunda. 'Descanso'.\nEl movimiento es como el anterior; pero tendrá el marinero libertad para hablar en voz baja.",
                    "Para pasar de la posición de descanso a la de firmes se darán las voces:\nPrimera. 'Recluta' (o pelotón, o sección, etc.).\nSegunda. 'Firmes'.\nAl oir la primera, el marinero carga el peso del cuerpo sobre el pie que tenga delante," +
                            " enderezará la pierna correspondiente y, elevando el talón del pie retrasado, esperará hasta oir la segunda voz. Cuando la oiga, llevará el pie retrasado al frente, quedando cuadrado.\nMuchas veces se omite la primera voz" +
                            " y al oir la de firmes se harán los movimientos anteriores seguidos."
                )
            ),
            Subchapter(
                title = "Movimientos de cabeza", index = 3,
                paragrahps = arrayListOf(
                    "Voces:\nPrimera. Vista a la derecha (o a la izquierda).\nSegunda. Mar.",
                    "A la segunda, el marinero volverá la cabeza hacia el costado que en la voz se indique, cuidando de no mover el cuerpo ni echar hacia adelante la cabeza. Así permanecrá hasta que se mande 'firmes' o 'vista al frente'."
                )
            ),
            Subchapter(
                title = "Giros a pie firme", index = 4,
                paragrahps = arrayListOf(
                    "Hacer frente a uno de los costados. Voces:\nPrimera. Derecha (o izquierda).\nSegunda. Mar.",
                    "Para hacer derecha, a la primera voz o voz preventiva se cargará el peso del cuerpo simultáneamente sobre el talón del pie derecho y la punta del izquierdo. A la segunda voz o voz ejecutiva, apoyándose sobre la punta" +
                            " del pie izquierdo , y girando sobre él y el talón del derecho, volverá el cuerpo hacie el costado indicado, hasta dejar el pie derecho en la dirección que tendrá en el nuevo frente, y en ese momento llevará el pie izquierdo junto" +
                            " al derecho, quedando cuadredo al nuevo frente.\nEl movimiento hacia el costado izquierdo se ejecutará de modo análogo, utilizando como ejes de giro el talón del pie izquierdo y la punta del derecho," +
                            " sobre la que se apoyará para hacer el movimiento."
                    ,
                    "Girar a frente oblicuo. Voces:\nPrimera. Media vuelta.\nSegunda. Mar.",
                    "El movimiento se hará como se indica en el caso anterior, sin hacer mas que medio giro al costado que se mande.",
                    "Hacer frente a donde se tenía la espalda. Voces:\nPrimera. Media vuelta.\nSegunda Mar.",
                    "A la segunda se harán sin precipitación dos giros seguidos a la derecha en la forma dicha, quedando el pecho donde se tenía la espalda. Al girar no se separarán los brazos del cuerpo."
                )
            ),
            Subchapter(
                title = "Marchar: distintos pasos", index = 5,
                paragrahps = arrayListOf(
                    "Paso Ordinario. Voces:\nPrimera. De frente.\nSegunda. Mar.",
                    "Al oir la voz preventiva se cargará el peso del cuerpo sobre la pierna derecha, preparándose para empezar a andar con el pie izuierdo cuando se oiga la voz ejecuritva. Al marchar se llevará el cuerpo derecho," +
                                " la cabeza levantada, el pecho fuera, los hombros retirados y la vista al frente. Se llevará el compás del paso con el ruido de la pisada, teniendo en cuenta que la velocidad  es de 130 pasos por minuto, y la longitud" +
                                " de éstos, de 65 centímetros de talón a talón. Los brazos se moverán con soltura y acompasadamente con el paso, sin incurrir en exageraciones. Al llevarlos hacia adelante, las manos deben llegar a la altura de la cntura, sin pasar de ahí," +
                                " y al llevarlos hacia atrás, las manos rebasarán ligeramente los muslos."
                    ,
                     "Paso de maniobra. Voces:\nPrimera. Paso de maniobra.\nSegunda. Mar."

                )
            ),
            Subchapter(
                title = "Giros y cambios de dirección", index = 6
            ),
            Subchapter(
                title = "Instrucción con armas", index = 7

            ),
            Subchapter(
                title = "Posición de firmes", index = 8

            ),
            Subchapter(
                title = "Descanso en su lugar", index = 9

            ),
            Subchapter(
                title = "Presentar el arma", index = 10

            ),
            Subchapter(
                title = "Arma sobre el hombro", index = 11

            ),
            Subchapter(
                title = "Suspender el arma", index = 12

            ),
            Subchapter(
                title = "Colgar las armas", index = 13

            ),
            Subchapter(
                title = "Armar y envainar el cuchillo", index = 14

            ),
            Subchapter(
                title = "Echar a tierra el arma", index = 15

            ),
            Subchapter(
                title = "Marchar con armas", index = 16

            ),
            Subchapter(title = "Marchar con el arma al hombro o suspendida", index = 17),
            Subchapter(
                title = "Arma a la funerala", index = 18

            ),
            Subchapter(
                title = "Alineaciones", index = 19

            ),
            Subchapter(
                title = "Formación en fila", index = 20

            ),
            Subchapter(
                title = "Formación en comumna", index = 21

            ),
            Subchapter(
                title = "Deshacer y restablecer la formación", index = 22

            ),
            Subchapter(
                title = "Revistas y desfiles", index = 23

            ),
            Subchapter(
                title = "Revista de armas", index = 24

            )
        )
    )


    fun addChapters() {
        chapters.add(chapterOne)
        chapters.add(chapterTwo)
        chapters.add(chapterThree)
        chapters.add(chapterFour)


    }
}