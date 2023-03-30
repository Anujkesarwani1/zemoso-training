import LogoutIcon from '@mui/icons-material/Logout';
import { styled, Avatar, Typography, Paper, Grid, Button } from '@mui/material'


const MuiPaper = styled(Paper)({
    padding: '1rem',
    width: '17%',
    border: '100%',
});

const MuiGrid = styled(Grid)({
    paddingRight: '1rem',
});

const H6Typo = styled(Typography)({
    fontSize: '1rem',
    fontWeight: 'bold',
});

const Body1Typo = styled(Typography)({
    fontSize: '10px',
    color: "gray",
});

const MuiLogoutIcon = styled(LogoutIcon)({
    color: 'gray',
})

const Account = () => {
    return (
        <MuiPaper elevation={3}>
            <Grid container direction="row">
                <MuiGrid item>
                    <Avatar src='https://mui.com/static/images/avatar/2.jpg' alt='Avatar not found' />
                </MuiGrid>
                <Grid item>
                    <H6Typo variant='h6'>James Rodriquez</H6Typo>
                    <Body1Typo variant='body1'>James.co</Body1Typo>
                </Grid>
                <Grid item>
                    <Button endIcon={<MuiLogoutIcon />} size="large"></Button>
                </Grid>
            </Grid>
        </MuiPaper>
    );
}

export default Account;

