public class Main {
    public static void main(String[] args){

        String bigText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                "dolore magna aliqua. Senectus et netus et malesuada fames ac turpis egestas. Amet est placerat in egestas erat imperdiet. " +
                "Lacinia quis vel eros donec ac odio tempor orci. Odio morbi quis commodo odio aenean sed adipiscing diam. Scelerisque mauris " +
                "pellentesque pulvinar pellentesque habitant morbi. Turpis cursus in hac habitasse. Consectetur libero id faucibus nisl tincidunt " +
                "eget nullam non. In hac habitasse platea dictumst vestibulum rhoncus est. Fermentum et sollicitudin ac orci phasellus egestas tellus " +
                "rutrum tellus. Nulla aliquet porttitor lacus luctus accumsan tortor posuere ac ut. Scelerisque eleifend donec pretium vulputate sapien." +
                " Quam elementum pulvinar etiam non quam lacus suspendisse faucibus. Varius vel pharetra vel turpis nunc eget. Pulvinar sapien et ligula" +
                " ullamcorper malesuada. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Nec tincidunt praesent semper feugiat nibh sed" +
                " pulvinar proin gravida. Ultrices dui sapien eget mi proin sed libero. Ultricies tristique nulla aliquet enim tortor at auctor urna. " +
                "Odio tempor orci dapibus ultrices in iaculis nunc sed augue." +
                "Orci dapibus ultrices in iaculis nunc. Nisi quis eleifend quam adipiscing vitae proin sagittis nisl rhoncus. Et malesuada fames " +
                "ac turpis. Enim nec dui nunc mattis enim. Diam in arcu cursus euismod quis viverra nibh cras pulvinar. Consequat id porta nibh " +
                "venenatis cras. Consectetur adipiscing elit ut aliquam purus sit. Tellus in metus vulputate eu scelerisque felis imperdiet. " +
                "Sit amet dictum sit amet justo donec. Nisi est sit amet facilisis magna etiam. Lectus quam id leo in. Ac tortor dignissim " +
                "convallis aenean. Eget gravida cum sociis natoque penatibus et magnis dis parturient. In cursus turpis massa tincidunt. " +
                "At risus viverra adipiscing at in." +
                "Mi sit amet mauris commodo quis imperdiet massa tincidunt. Laoreet id donec ultrices tincidunt. Quam pellentesque nec nam aliquam " +
                "sem et tortor consequat. Nunc sed id semper risus in hendrerit gravida rutrum quisque. Ipsum suspendisse ultrices gravida dictum " +
                "fusce ut. Ornare quam viverra orci sagittis eu volutpat. Risus nullam eget felis eget nunc. Vulputate odio ut enim blandit volutpat " +
                "maecenas volutpat blandit. Massa enim nec dui nunc mattis. Pharetra pharetra massa massa ultricies mi quis hendrerit. Volutpat commodo " +
                "sed egestas egestas fringilla phasellus faucibus scelerisque. Arcu odio ut sem nulla pharetra. Scelerisque eu ultrices vitae auctor." +
                " Nunc pulvinar sapien et ligula ullamcorper malesuada proin libero nunc. Morbi enim nunc faucibus a pellentesque. Ornare lectus sit" +
                " amet est placerat in egestas erat. Dictumst vestibulum rhoncus est pellentesque elit." +
                "Varius quam quisque id diam vel quam elementum. Natoque penatibus et magnis dis parturient. Aliquam ut porttitor leo a diam sollicitudin " +
                "tempor id eu. Arcu cursus euismod quis viverra. Pretium fusce id velit ut tortor pretium viverra suspendisse. Mi quis hendrerit dolor magna" +
                " eget est lorem ipsum. Viverra maecenas accumsan lacus vel. Tempus imperdiet nulla malesuada pellentesque elit eget gravida cum. " +
                "Facilisis volutpat est velit egestas dui id. Cursus risus at ultrices mi tempus imperdiet nulla malesuada pellentesque. Commodo quis " +
                "imperdiet massa tincidunt nunc. Egestas congue quisque egestas diam in arcu cursus euismod. Nulla posuere sollicitudin aliquam ultrices. " +
                "Est ante in nibh mauris cursus. Odio morbi quis commodo odio. Id cursus metus aliquam eleifend." +
                "Proin sagittis nisl rhoncus mattis. Mauris pellentesque pulvinar pellentesque habitant. Neque gravida in fermentum et sollicitudin ac" +
                " orci phasellus. Integer quis auctor elit sed vulputate mi sit. Platea dictumst vestibulum rhoncus est pellentesque elit ullamcorper." +
                " Tincidunt ornare massa eget egestas purus. Arcu ac tortor dignissim convallis aenean. Senectus et netus et malesuada fames. Viverra " +
                "suspendisse potenti nullam ac tortor vitae purus faucibus ornare. Cras sed felis eget velit aliquet sagittis id consectetur purus. " +
                "Suspendisse interdum consectetur libero id faucibus. Tristique nulla aliquet enim tortor at. Tincidunt vitae semper quis lectus nulla at." +
                " Lectus sit amet est placerat in egestas erat. Nunc faucibus a pellentesque sit amet.";

        boolean qwerty = new WordsChecker(bigText).hasWord("amet");
        System.out.println(qwerty);
    }
}
