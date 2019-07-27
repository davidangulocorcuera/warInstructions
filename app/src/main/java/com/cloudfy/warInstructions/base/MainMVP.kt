package com.cloudfy.warInstructions.base


class MainMVP {

    interface View {
        fun hideKeyboard()

    }

    interface Presenter {

    }

    interface Interactor {
        fun execute()

        interface CallbackResult<in T> {
            fun onSuccess(result: T)
            fun onFinish() {}
        }
    }

}