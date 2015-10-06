// JAVA
// ====
// boolean hasUpperCase = false;
// for(int i = 0; i < name.length(); i++)
// {
//     if(Character.isUpperCase(name.charAt(i))){
//         hasUpperCase = true;
//         break;
//     }
// }

val lower = "test"
val upper = "Test"
val hasntUpperCase = lower.exists(_.isUpper)
val hasUpperCase = upper.exists(_.isUpper)
println(hasntUpperCase)
println(hasUpperCase)
