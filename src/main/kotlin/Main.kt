fun main() {
    println (match("22-April-2023", 134, "15",
            "Rhinos", "Buffaloes", "Legends Rugby Club", "4:00 PM")); }
fun match(fDate:String, fGameNo:Int, fGameWeek:String, fHomeTeam:String, fAwayTeam:String, fvenue:String, fTime:String,
          ) : String {
    val date ="$fDate"
    val GameNo ="$fGameNo"
    val GameWeek ="$fGameWeek"
    val HomeTeam ="$fHomeTeam"
    val AwayTeam ="$fAwayTeam"
    val venue= "$fvenue"
    val time = "$fTime"
    return "$date \n NSSPL game no: $GameNo \n week $GameWeek \n $HomeTeam Vs $AwayTeam \n $venue \n $time";
}