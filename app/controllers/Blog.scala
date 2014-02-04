package controllers

import play.api.mvc.{Action, Controller}

/**
 * Created by pascr on 04.02.14.
 */
object Blog extends Controller
{

    def index =  Action {
      Ok(views.html.soon("You will soon be able to read my blog here", "Blog"))
    }

}
