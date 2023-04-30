package programmer.zaman.now.data;

//parent
class SocialMedia {
    String name;
}

//keyword "final" pada prefix class menandakan bahwa
//class ini tidak bisa menjadi parent bagi child class
final class Facebook extends SocialMedia{

}

//class FakeFacebook tidak bisa menjadikan Facebook sebagai parent
//karena class Facebook memiliki keyword "final"
//class FakeFacebook extends Facebook{
//
//}


