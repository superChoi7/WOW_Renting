import AccountDataService from "services/account.service";

export default function Logout() {
  console.log("[logout] logout");
  AccountDataService.logout()
    .then((response) => {
      console.log(response);
      if (response.data.success) {
        
        window.location.reload();
        return true;
      }
      console.log("[logout] logout failed");
      return false;
    });
}

